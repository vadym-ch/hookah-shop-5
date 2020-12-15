package com.example.mediator.rabbitmq;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mediator.dto.HookahSellRequest;
import com.example.mediator.models.hookah.Hookah;
import com.example.mediator.models.hookah.HookahMaterial;
import com.example.mediator.models.hookah.HookahProducer;
import com.example.mediator.models.hookah.HookahSize;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

@RestController
@RequestMapping(value = "/rabbitmq_hookahs")
public class HookahSend {
    private final static String ADDING = "hookah_adding";
    private final static String DELETING = "hookah_deleting";

    @PostMapping
    public ResponseEntity<String> create(@RequestParam HookahProducer producer, @RequestParam HookahMaterial material,
            @RequestParam HookahSize size, @RequestParam int price) throws Exception {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        try (Connection connection = factory.newConnection()) {
            Channel channel = connection.createChannel();
            channel.queueDeclare(ADDING, true, false, false, null);
            Hookah hookah = new Hookah(producer, material, size, price);
            channel.basicPublish("", ADDING, null, new ObjectMapper().writeValueAsBytes(hookah));
            System.out.println(" [x] Sent 'create " + hookah + "'");
        }
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<String> delete(@RequestBody HookahSellRequest hookahSellRequest) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        try (Connection connection = factory.newConnection()) {
            Channel channel = connection.createChannel();
            channel.queueDeclare(DELETING, true, false, false, null);
            channel.basicPublish("", DELETING, null, new ObjectMapper().writeValueAsBytes(hookahSellRequest));
            System.out.println(" [x] Sent 'sell hookah " + hookahSellRequest);
        }
        return ResponseEntity.ok().build();
    }
}
