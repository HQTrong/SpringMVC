package com.example.Service;

import com.example.Entity.Employee;
import com.example.batisbl.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeMapper mapper;
    @Override
    public List<Employee> listEm() {
        List<Employee> list = mapper.getAllEmployees();
        int a=3;
        return list.isEmpty() || list == null ? null : list;
    }
}
