package com.example.mybatis3.repository;

import com.example.mybatis3.model.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface EmployeeMapper {
    List<Employee> findAll();

    int insert(Employee employee);
}