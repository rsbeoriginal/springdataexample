package com.example.springdataexample.controller;

import com.example.springdataexample.dto.EmployeeRequestDto;
import com.example.springdataexample.dto.EmployeeResponseDto;
import com.example.springdataexample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rishi
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  //POST - /employee
  @PostMapping
  public EmployeeResponseDto createEmployee
  (@RequestBody EmployeeRequestDto employeeRequestDto){
    return employeeService.createEmployee(employeeRequestDto);
  }

  //GET - /employee/{id}

  //PUT - /employee/{id}

  //DELETE - /employee/{id}
}
