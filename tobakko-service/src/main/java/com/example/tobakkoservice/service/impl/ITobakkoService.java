package com.example.tobakkoservice.service.impl;

import java.util.List;

import com.example.tobakkoservice.service.TobakkoService;
import com.example.tobakkoservice.service.models.Tobakko;
import com.example.tobakkoservice.service.models.TobakkoFirm;
import com.example.tobakkoservice.service.models.TobakkoStrength;
import com.example.tobakkoservice.service.models.TobakkoTaste;
import com.example.tobakkoservice.service.repo.TobakkoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ITobakkoService implements TobakkoService {

    private final TobakkoRepo tobakkoRepo;

    @Autowired
    ITobakkoService(TobakkoRepo tobakkoRepo) {
        this.tobakkoRepo = tobakkoRepo;
    }

    @Override
    public int getTobakkoPrice(String id) {
        Tobakko tobakko = tobakkoRepo.findById(id).get();
        return tobakko.getPrice();
    }

    @Override
    public void sellTobakko(String id) {
        tobakkoRepo.delete(getTobakkoById(id));
    }

    @Override
    public Tobakko getTobakkoById(String id) {
        return tobakkoRepo.findById(id).get();
    }

    @Override
    public Tobakko deliverToShop(TobakkoFirm firm, TobakkoTaste taste, TobakkoStrength strength, int price) {
        Tobakko tobakko = new Tobakko(firm, taste, strength, price);
        tobakkoRepo.save(tobakko);
        return tobakko;
    }

    @Override
    public List<Tobakko> getTobakkos() {
        List<Tobakko> allTobakkos = (List<Tobakko>) tobakkoRepo.findAll();
        return allTobakkos;
    }

    @Override
    public String tobakkoRemainder() {
        List<Tobakko> allTobakkos = (List<Tobakko>) tobakkoRepo.findAll();

        String remainder = "All tobakko left on stock:\n";

        for (Tobakko tobakko : allTobakkos) {
            System.out.println(tobakko);
            remainder += tobakko + "\n";
        }

        return remainder;
    }

    @Override
    public void createTobakko(Tobakko tobakko) {
        tobakkoRepo.save(tobakko);
    }

}
