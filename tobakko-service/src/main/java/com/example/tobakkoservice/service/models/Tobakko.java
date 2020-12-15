package com.example.tobakkoservice.service.models;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import lombok.Data;

@Entity
@EnableAutoConfiguration
@Data
public final class Tobakko {
    @Id
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

    public String getTobakkoId() {
        return tobakkoId;
    }

    public String getFirm() {
        return firm.toString();
    }

    public String getTaste() {
        return taste.toString();
    }

    public String getStrength() {
        return strength.toString();
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return firm + " " + strength + " with " + taste + " taste. Price: " + price + ". Product Id: " + tobakkoId;
    }

}
