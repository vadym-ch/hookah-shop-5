package com.example.employeeservice.services.impl;

import java.util.List;

import com.example.employeeservice.services.EmployeeService;
import com.example.employeeservice.services.models.Employee;
import com.example.employeeservice.services.repos.EmployeeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IEmployeeService implements EmployeeService {

    private final EmployeeRepo employeeRepo;

    @Autowired
    IEmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public Employee engageEmployee(String name, String surname) {
        Employee employee = new Employee(name, surname);
        employeeRepo.save(employee);
        return employee;
    }

    @Override
    public Employee getEmployeeById(String id) {
        return employeeRepo.findById(id).get();
    }

    @Override
    public void deleteEmployeeById(String id) {
        employeeRepo.delete(getEmployeeById(id));
    }

    @Override
    public List<Employee> getEmployees() {
        List<Employee> employees = (List<Employee>) employeeRepo.findAll();
        return employees;
    }

    @Override
    public String employeeReview() {
        List<Employee> employees = (List<Employee>) employeeRepo.findAll();

        System.out.println("Employees:");
        String review = "Employees list:\n";

        for (Employee employee : employees) {
            System.out.println(employee);
            review += employee + "\n";
        }

        return review;
    }

    @Override
    public void createEmployee(Employee employee) {
        employeeRepo.save(employee);
    }
}
