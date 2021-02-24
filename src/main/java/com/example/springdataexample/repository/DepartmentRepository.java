package com.example.springdataexample.repository;

import com.example.springdataexample.entity.Department;
import org.springframework.data.repository.CrudRepository;

/**
 * @author rishi
 */
public interface DepartmentRepository extends CrudRepository<Department, Long> {}
