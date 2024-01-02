package com.example.mybatis3.controller;

import com.example.mybatis3.model.Employee;
import com.example.mybatis3.repository.EmployeeMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class testcontroller {
    @Autowired
    EmployeeMapper mapper;
    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(Model model)
    {
        List<Employee> list = mapper.findAll();
        return  list.isEmpty() || list == null ? null : ResponseEntity.ok(list);
    }

    @PostMapping("/insert")
    public ResponseEntity<?> getAll(Model model, @RequestBody Employee employee)
    {
        mapper.insert(employee);
        return ResponseEntity.ok(employee);
    }

}
