package com.example.employeeservice.api.controllers;

import com.example.employeeservice.services.EmployeeService;
import com.example.employeeservice.services.models.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
    private final EmployeeService paymentService;

    @Autowired
    public EmployeeController(EmployeeService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public ResponseEntity<Employee> create(@RequestParam String name, @RequestParam String surname) {
        return ResponseEntity.ok(paymentService.engageEmployee(name, surname));
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestParam String id) {
        paymentService.deleteEmployeeById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<String> show() {
        return ResponseEntity.ok(paymentService.employeeReview());
    }
}
