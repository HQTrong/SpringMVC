package com.example.batisbl;

import com.example.Entity.Employee;
import com.example.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeMapper {
    public List<Employee> getAllEmployees(){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        List<Employee> employeesList = session.selectList("getAllEmployees");
        return employeesList;
    }
}
