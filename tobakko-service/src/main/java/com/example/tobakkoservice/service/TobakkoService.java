package com.example.tobakkoservice.service;

import com.example.tobakkoservice.service.models.Tobakko;
import com.example.tobakkoservice.service.models.TobakkoFirm;
import com.example.tobakkoservice.service.models.TobakkoStrength;
import com.example.tobakkoservice.service.models.TobakkoTaste;

import java.util.List;

public interface TobakkoService {

    void sellTobakko(String id);

    int getTobakkoPrice(String id);

    Tobakko deliverToShop(TobakkoFirm firm, TobakkoTaste taste, TobakkoStrength strength, int price);

    Tobakko getTobakkoById(String id);

    List<Tobakko> getTobakkos();

    String tobakkoRemainder();

    void createTobakko(Tobakko tobakko);
}
