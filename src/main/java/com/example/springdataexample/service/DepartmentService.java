package com.example.springdataexample.service;

import com.example.springdataexample.dto.DepartmentRequestDto;
import com.example.springdataexample.dto.DepartmentResponseDto;

/**
 * @author rishi
 */
public interface DepartmentService {
  DepartmentResponseDto createDepartment(DepartmentRequestDto departmentRequestDto);
}
