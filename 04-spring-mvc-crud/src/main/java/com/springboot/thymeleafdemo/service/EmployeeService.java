package com.springboot.thymeleafdemo.service;

import com.springboot.thymeleafdemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    // same methods used for the DAO Layer
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
