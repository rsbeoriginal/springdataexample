package com.example.springdataexample.service;

import com.example.springdataexample.dto.DepartmentRequestDto;
import com.example.springdataexample.dto.DepartmentResponseDto;
import com.example.springdataexample.dto.EmployeeResponseDto;
import com.example.springdataexample.entity.Department;

import java.util.List;

/**
 * @author rishi
 */
public interface DepartmentService {
  DepartmentResponseDto createDepartment(DepartmentRequestDto departmentRequestDto);

  Department getDepartmentById(Long id);

  DepartmentResponseDto updateDepartment(Long departmentId, DepartmentRequestDto departmentRequestDto);

  List<EmployeeResponseDto> getMostExperiencedEmployeeListInDepartment(Long departmentId);

  List<DepartmentResponseDto> getMostExperiencedDepartmentList();
}
