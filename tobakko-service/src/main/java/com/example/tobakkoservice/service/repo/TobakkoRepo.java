package com.example.tobakkoservice.service.repo;

import com.example.tobakkoservice.service.models.Tobakko;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TobakkoRepo extends CrudRepository<Tobakko, String> {
}