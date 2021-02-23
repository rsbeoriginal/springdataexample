package com.example.springdataexample.repository;

import com.example.springdataexample.entity.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * @author rishi
 */
public interface EmployeeRepository
    extends CrudRepository<Employee, Long> {}
