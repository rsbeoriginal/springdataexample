package com.example.springdataexample.service;

import com.example.springdataexample.dto.DepartmentRequestDto;
import com.example.springdataexample.dto.DepartmentResponseDto;
import com.example.springdataexample.entity.Department;

/**
 * @author rishi
 */
public interface DepartmentService {
  DepartmentResponseDto createDepartment(DepartmentRequestDto departmentRequestDto);

  Department getDepartmentById(Long id);

  DepartmentResponseDto updateDepartment(Long departmentId, DepartmentRequestDto departmentRequestDto);
}
