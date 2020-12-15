package com.example.mediator.models.tobakko;

import java.util.UUID;

import lombok.Data;

@Data
public final class Tobakko {

    private String tobakkoId;
    private TobakkoFirm firm;
    private TobakkoTaste taste;
    private TobakkoStrength strength;
    private int price;

    public Tobakko(TobakkoFirm firm, TobakkoTaste taste, TobakkoStrength strength, int price) {
        this.firm = firm;
        this.taste = taste;
        this.strength = strength;
        this.price = price;
        this.tobakkoId = UUID.randomUUID().toString();
    }

    public Tobakko() {

    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return firm + " " + strength + " with " + taste + " taste. Price: " + price + ". Product Id: " + tobakkoId;
    }

}
