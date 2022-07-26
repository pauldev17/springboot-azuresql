package com.example.springbootazuresql.controller;

import com.example.springbootazuresql.entity.Employee;
import com.example.springbootazuresql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getAll() {
        List<Employee> employees = service.getAll();
        if (employees.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @PostMapping("/employee")
    public ResponseEntity<Employee> save(@RequestBody Employee employee) {
        Employee employeeNew = service.save(employee);
        if (employeeNew == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(employeeNew, HttpStatus.OK);
    }
}
