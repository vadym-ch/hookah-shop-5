package com.example.mediator.api.controllers;

import com.example.mediator.models.hookah.HookahMaterial;
import com.example.mediator.models.hookah.HookahProducer;
import com.example.mediator.models.hookah.HookahSize;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping(value = "hookahs")
public class HookahController {
    private final RestTemplate template = new RestTemplate();
    private final String address = "http://localhost:8084/hookahs/";

    @PostMapping
    public ResponseEntity<String> create(@RequestParam HookahProducer producer, @RequestParam HookahMaterial material,
            @RequestParam HookahSize size, @RequestParam int price) {

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).queryParam("producer", producer)
                .queryParam("material", material).queryParam("size", size).queryParam("price", price);
        HttpEntity<String> response = template.exchange(builder.toUriString(), HttpMethod.POST, null, String.class);
        return ResponseEntity.ok(response.getBody());
    }

    @GetMapping
    public ResponseEntity<String> show() {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address);

        HttpEntity<String> response = template.exchange(builder.toUriString(), HttpMethod.GET, null, String.class);
        return ResponseEntity.ok(response.getBody());
    }

    @DeleteMapping
    public void delete(@RequestParam String paymentId, @RequestParam String hookahId) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).queryParam("hookahId", hookahId)
                .queryParam("paymentId", paymentId);

        template.exchange(builder.toUriString(), HttpMethod.DELETE, null, Object.class);
    }

}