package com.example.mybatis3;

import com.example.mybatis3.repository.EmployeeMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mybatis3.repository")
public class Mybatis3Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Mybatis3Application.class, args);
    }

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public void run(String... args) {
        employeeMapper.findAll().forEach(System.out::println);
    }
}
