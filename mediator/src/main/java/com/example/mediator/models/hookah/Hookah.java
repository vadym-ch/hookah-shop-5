package com.example.mediator.models.hookah;

import java.util.UUID;

import lombok.Data;

@Data
public final class Hookah {
    private String hookahId;
    private HookahProducer producer;
    private HookahMaterial material;
    private HookahSize size;
    private int price;

    public Hookah(HookahProducer producer, HookahMaterial material, HookahSize size, int price) {
        this.producer = producer;
        this.material = material;
        this.size = size;
        this.price = price;
        this.hookahId = UUID.randomUUID().toString();
    }

    public Hookah() {

    }

    @Override
    public String toString() {
        return size + " " + material + " hookah made in " + producer + ". Price: " + price + ". Product Id: "
                + hookahId;
    }

}
