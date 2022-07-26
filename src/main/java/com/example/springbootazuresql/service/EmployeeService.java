package com.example.springbootazuresql.service;

import com.example.springbootazuresql.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getAll();
    Employee save(Employee employee);
}
