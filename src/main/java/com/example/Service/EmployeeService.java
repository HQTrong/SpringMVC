package com.example.Service;

import com.example.Entity.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface EmployeeService {
List<Employee> listEm ();
}
