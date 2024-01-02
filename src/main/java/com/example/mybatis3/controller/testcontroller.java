package com.example.mybatis3.controller;

import com.example.mybatis3.model.Employee;
import com.example.mybatis3.repository.EmployeeMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class testcontroller {
    @Autowired
    EmployeeMapper mapper;
    @GetMapping("/test")
    public ResponseEntity<?> getAll(Model model)
    {
        List<Employee> list = mapper.findAll();
        return  list.isEmpty() || list == null ? null : ResponseEntity.ok(list);
    }

}
