package com.example.springdataexample.repository;

import com.example.springdataexample.entity.Department;
import com.example.springdataexample.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author rishi
 */
public interface EmployeeRepository
    extends CrudRepository<Employee, Long> {


  //by method name
  List<Employee> findByDepartment(Department department);

  //by @Query annotation


  //by native query


}
