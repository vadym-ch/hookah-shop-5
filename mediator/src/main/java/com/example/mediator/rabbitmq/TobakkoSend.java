package com.example.mediator.rabbitmq;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mediator.dto.TobakkoSellRequest;
import com.example.mediator.models.tobakko.Tobakko;
import com.example.mediator.models.tobakko.TobakkoFirm;
import com.example.mediator.models.tobakko.TobakkoStrength;
import com.example.mediator.models.tobakko.TobakkoTaste;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

@RestController
@RequestMapping(value = "/rabbitmq_tobakkos")
public class TobakkoSend {
    private final static String ADDING = "tobakko_adding";
    private final static String DELETING = "tobakko_deleting";

    @PostMapping
    public ResponseEntity<String> create(@RequestParam TobakkoFirm firm, @RequestParam TobakkoTaste taste,
            @RequestParam TobakkoStrength strength, @RequestParam int price) throws Exception {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        try (Connection connection = factory.newConnection()) {
            Channel channel = connection.createChannel();
            channel.queueDeclare(ADDING, true, false, false, null);
            Tobakko tobakko = new Tobakko(firm, taste, strength, price);
            channel.basicPublish("", ADDING, null, new ObjectMapper().writeValueAsBytes(tobakko));
            System.out.println(" [x] Sent create" + tobakko);
        }
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<String> delete(@RequestBody TobakkoSellRequest tobakkoSellRequest) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        try (Connection connection = factory.newConnection()) {
            Channel channel = connection.createChannel();
            channel.queueDeclare(DELETING, true, false, false, null);
            channel.basicPublish("", DELETING, null, new ObjectMapper().writeValueAsBytes(tobakkoSellRequest));
            System.out.println(" [x] Sent 'sell tobakko " + tobakkoSellRequest);
        }
        return ResponseEntity.ok().build();
    }
}
