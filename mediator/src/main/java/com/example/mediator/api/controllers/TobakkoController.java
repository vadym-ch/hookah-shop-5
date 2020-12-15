package com.example.mediator.api.controllers;

import com.example.mediator.models.tobakko.TobakkoFirm;
import com.example.mediator.models.tobakko.TobakkoStrength;
import com.example.mediator.models.tobakko.TobakkoTaste;

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
@RequestMapping(value = "tobakkos")
public class TobakkoController {
    private final RestTemplate template = new RestTemplate();
    private final String address = "http://localhost:8081/tobakkos/";

    @PostMapping
    public ResponseEntity<String> create(@RequestParam TobakkoFirm firm, @RequestParam TobakkoTaste taste,
            @RequestParam TobakkoStrength strength, @RequestParam int price) {

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).queryParam("firm", firm)
                .queryParam("taste", taste).queryParam("strength", strength).queryParam("price", price);
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
    public void delete(@RequestParam String paymentId, @RequestParam String tobakkoId) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).queryParam("tobakkoId", tobakkoId)
                .queryParam("paymentId", paymentId);

        template.exchange(builder.toUriString(), HttpMethod.DELETE, null, Object.class);
    }

}
