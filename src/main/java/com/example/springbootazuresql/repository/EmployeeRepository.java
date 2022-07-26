package com.example.springbootazuresql.repository;

import com.example.springbootazuresql.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
