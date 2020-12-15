package com.example.hookahservice.api.controllers;

import com.example.hookahservice.service.HookahService;
import com.example.hookahservice.service.models.Hookah;
import com.example.hookahservice.service.models.HookahMaterial;
import com.example.hookahservice.service.models.HookahProducer;
import com.example.hookahservice.service.models.HookahSize;

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
@RequestMapping(value = "hookahs")
public class HookahController {
    private final HookahService hookahService;

    @Autowired
    public HookahController(HookahService hookahService) {
        this.hookahService = hookahService;
    }

    @PostMapping
    public ResponseEntity<Hookah> create(@RequestParam HookahProducer producer, @RequestParam HookahMaterial material,
            @RequestParam HookahSize size, @RequestParam int price) {

        return ResponseEntity.ok(hookahService.deliverToShop(producer, material, size, price));
    }

    @DeleteMapping
    public void delete(@RequestParam String hookahId, @RequestParam String paymentId) {
        int hookahPrice = hookahService.getHookahPrice(hookahId);

        String address = "http://payment-service:8083/payments/";
        RestTemplate restTempl = new RestTemplate();
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).queryParam("paymentId", paymentId)
                .queryParam("price", hookahPrice);
        restTempl.exchange(builder.toUriString(), HttpMethod.PUT, null, String.class);
    }

    @GetMapping
    public ResponseEntity<String> show() {
        return ResponseEntity.ok(hookahService.hookahRemainder());
    }

}