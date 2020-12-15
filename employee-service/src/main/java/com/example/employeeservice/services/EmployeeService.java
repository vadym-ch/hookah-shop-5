package com.example.employeeservice.services;

import com.example.employeeservice.services.models.Employee;

import java.util.List;

public interface EmployeeService {

    Employee engageEmployee(String name, String surname);

    Employee getEmployeeById(String id);

    void deleteEmployeeById(String id);

    List<Employee> getEmployees();

    String employeeReview();

    void createEmployee(Employee employee);

}
