package com.example.hookahservice.service.repos;

import com.example.hookahservice.service.models.Hookah;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HookahRepo extends CrudRepository<Hookah, String> {
}
