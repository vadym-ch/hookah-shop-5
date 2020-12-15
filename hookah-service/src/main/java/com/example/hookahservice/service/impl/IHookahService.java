package com.example.hookahservice.service.impl;

import java.util.List;

import com.example.hookahservice.service.HookahService;
import com.example.hookahservice.service.models.Hookah;
import com.example.hookahservice.service.models.HookahMaterial;
import com.example.hookahservice.service.models.HookahProducer;
import com.example.hookahservice.service.models.HookahSize;
import com.example.hookahservice.service.repos.HookahRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IHookahService implements HookahService {

    private final HookahRepo hookahRepo;

    @Autowired
    IHookahService(HookahRepo hookahRepo) {
        this.hookahRepo = hookahRepo;
    }

    @Override
    public int getHookahPrice(String id) {
        Hookah hookah = hookahRepo.findById(id).get();
        return hookah.getPrice();
    }

    @Override
    public void sellHookah(String id) {
        hookahRepo.delete(getHookahById(id));
    }

    @Override
    public Hookah getHookahById(String id) {
        return hookahRepo.findById(id).get();
    }

    @Override
    public Hookah deliverToShop(HookahProducer producer, HookahMaterial material, HookahSize size, int price) {
        Hookah hookah = new Hookah(producer, material, size, price);
        hookahRepo.save(hookah);
        return hookah;
    }

    @Override
    public void createHookah(Hookah hookah) {
        hookahRepo.save(hookah);
    }

    @Override
    public List<Hookah> getHookahs() {
        List<Hookah> hookahs = (List<Hookah>) hookahRepo.findAll();
        return hookahs;
    }

    @Override
    public String hookahRemainder() {
        List<Hookah> allHookah = (List<Hookah>) hookahRepo.findAll();

        String remainder = "All hookah left on stock:\n";

        for (Hookah hookah : allHookah) {
            System.out.println(hookah);
            remainder += hookah + "\n";
        }

        return remainder;
    }
}
