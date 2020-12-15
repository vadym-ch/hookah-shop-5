package com.example.tobakkoservice.api.controllers;

import com.example.tobakkoservice.service.TobakkoService;
import com.example.tobakkoservice.service.models.Tobakko;
import com.example.tobakkoservice.service.models.TobakkoFirm;
import com.example.tobakkoservice.service.models.TobakkoStrength;
import com.example.tobakkoservice.service.models.TobakkoTaste;

import org.springframework.beans.factory.annotation.Autowired;
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
    private final TobakkoService tobakkoService;

    @Autowired
    public TobakkoController(TobakkoService tobakkoService) {
        this.tobakkoService = tobakkoService;
    }

    @PostMapping
    public ResponseEntity<Tobakko> create(@RequestParam TobakkoFirm firm, @RequestParam TobakkoTaste taste,
            @RequestParam TobakkoStrength strength, @RequestParam int price) {

        return ResponseEntity.ok(tobakkoService.deliverToShop(firm, taste, strength, price));
    }

    @DeleteMapping
    public void delete(@RequestParam String tobakkoId, @RequestParam String paymentId) {
        int tobakkoPrice = tobakkoService.getTobakkoPrice(tobakkoId);
        tobakkoService.sellTobakko(tobakkoId);

        String address = "http://payment-service:8083/payments/";
        RestTemplate restTemplate = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).queryParam("paymentId", paymentId)
                .queryParam("price", tobakkoPrice);
        restTemplate.exchange(builder.toUriString(), HttpMethod.PUT, null, String.class);
    }

    @GetMapping
    public ResponseEntity<String> show() {
        return ResponseEntity.ok(tobakkoService.tobakkoRemainder());
    }

}
