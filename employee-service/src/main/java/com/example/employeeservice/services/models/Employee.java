package com.example.employeeservice.services.models;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@EnableAutoConfiguration
@AllArgsConstructor
public final class Employee {
    @Id
    private String id;
    private String name;
    private String surname;

    public Employee() {
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getId() {
        return id;
    }

    public void WorkingStart() {
        final String open = "Greetings! I'm " + name + surname
                + ".\n My job is to sell hookah components. So I will get to my desk, open Hookah place balance and start to work .";
        System.out.println(open);
    }

    public void WorkingFinish() {
        final String closed = "Employee " + name + surname + "has finished to work today.";
        System.out.println(closed);
    }

    @Override
    public String toString() {
        return "Employee " + name + " " + surname + " with personal Id " + id;
    }
}
