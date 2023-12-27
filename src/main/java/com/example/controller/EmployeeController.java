package com.example.controller;

import com.example.Entity.Employee;
import com.example.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService service;
    @RequestMapping( value = "/hello")
    public List<Employee> getAll(Model model) {
        return service.listEm();
    }
}