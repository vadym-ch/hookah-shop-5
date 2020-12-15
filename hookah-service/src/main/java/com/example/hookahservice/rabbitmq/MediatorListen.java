package com.example.hookahservice.rabbitmq;

import java.util.concurrent.TimeoutException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.hookahservice.dto.HookahSellRequest;
import com.example.hookahservice.service.HookahService;
import com.example.hookahservice.service.models.Hookah;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

@Component
public class MediatorListen {
    private final static String ADDING = "hookah_adding";
    private final static String DELETING = "hookah_deleting";
    private final HookahService hookahService;
    private final PaymentSend paymentSend;

    @Autowired
    public MediatorListen(HookahService hookahService, PaymentSend paymentSend) {
        this.hookahService = hookahService;
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
            Hookah hookah = new ObjectMapper().readValue(message, Hookah.class);

            System.out.println(" [x] Received message to create '" + hookah + "'");
            hookahService.createHookah(hookah);
            ;
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
            HookahSellRequest hookahSellRequest = new ObjectMapper().readValue(message, HookahSellRequest.class);

            int hookahPrice = hookahService.getHookahPrice(hookahSellRequest.getHookahId());
            hookahService.sellHookah(hookahSellRequest.getHookahId());

            try {
                paymentSend.updatePaymentBalance(hookahSellRequest.getPaymentId(), hookahPrice);
            } catch (TimeoutException e) {
                e.printStackTrace();
            }

            System.out
                    .println(" [x] Received message to sell hookah with id '" + hookahSellRequest.getHookahId() + "'");
        };
        channel.basicConsume(DELETING, true, deliverCallback, consumerTag -> {
        });
    }
}