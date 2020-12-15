package com.example.tobakkoservice.rabbitmq;

import java.util.concurrent.TimeoutException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.example.tobakkoservice.dto.TobakkoSellRequest;
import com.example.tobakkoservice.service.TobakkoService;
import com.example.tobakkoservice.service.models.Tobakko;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

@Component
public class MediatorListen {
    private final static String ADDING = "tobakko_adding";
    private final static String DELETING = "tobakko_deleting";
    private final TobakkoService tobakkoService;
    private final PaymentSend paymentSend;

    @Autowired
    public MediatorListen(TobakkoService tobakkoService, PaymentSend paymentSend) {
        this.tobakkoService = tobakkoService;
        this.paymentSend = paymentSend;
    }

    @PostConstruct
    public void consumeCreateMessageFromQueue() throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(ADDING, true, false, false, null);
        System.out.println(" [*] Waiting for messages...");

        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody(), "UTF-8");
            Tobakko tobakko = new ObjectMapper().readValue(message, Tobakko.class);

            System.out.println(" [x] Received message to create '" + tobakko + "'");
            tobakkoService.createTobakko(tobakko);
        };
        channel.basicConsume(ADDING, true, deliverCallback, consumerTag -> {
        });
    }

    @PostConstruct
    public void consumeDeleteMessageFromQueue() throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();

        Channel channel = connection.createChannel();

        channel.queueDeclare(DELETING, true, false, false, null);
        System.out.println(" [*] Waiting for messages...");

        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody(), "UTF-8");
            TobakkoSellRequest tobakkoSellRequest = new ObjectMapper().readValue(message, TobakkoSellRequest.class);

            int tobakkoPrice = tobakkoService.getTobakkoPrice(tobakkoSellRequest.getTobakkoId());
            tobakkoService.sellTobakko(tobakkoSellRequest.getTobakkoId());
            System.out.println(tobakkoPrice);
            System.out.println(tobakkoSellRequest.getPaymentId());

            try {
                paymentSend.updatePaymentBalance(tobakkoSellRequest.getPaymentId(), tobakkoPrice);
            } catch (TimeoutException e) {
                e.printStackTrace();
            }

            System.out.println(
                    " [x] Received message to sell tobakko with id '" + tobakkoSellRequest.getTobakkoId() + "'");

        };
        channel.basicConsume(DELETING, true, deliverCallback, consumerTag -> {
        });
    }
}
