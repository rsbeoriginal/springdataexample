package com.example.springdataexample.service;

import com.example.springdataexample.dto.EmployeeRequestDto;
import com.example.springdataexample.dto.EmployeeResponseDto;

/**
 * @author rishi
 */
public interface EmployeeService {

  EmployeeResponseDto createEmployee(EmployeeRequestDto employeeRequestDto);

  EmployeeResponseDto getEmployeeById(Long id);

  EmployeeResponseDto updateEmployeeById(Long id, EmployeeRequestDto employeeRequestDto);

  EmployeeResponseDto deleteEmployeeById(Long id);
}
