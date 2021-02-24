package com.example.springdataexample.service.impl;

import com.example.springdataexample.dto.DepartmentRequestDto;
import com.example.springdataexample.dto.DepartmentResponseDto;
import com.example.springdataexample.entity.Department;
import com.example.springdataexample.repository.DepartmentRepository;
import com.example.springdataexample.service.DepartmentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rishi
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

  @Autowired
  private DepartmentRepository departmentRepository;

  @Override
  public DepartmentResponseDto createDepartment(DepartmentRequestDto departmentRequestDto) {
    Department department = new Department();

    BeanUtils.copyProperties(departmentRequestDto, department);

    Department savedDepartment = departmentRepository.save(department);

    DepartmentResponseDto responseDto = new DepartmentResponseDto();
    BeanUtils.copyProperties(savedDepartment, responseDto);

    return responseDto;
  }

  @Override
  public Department getDepartmentById(Long id) {
    return departmentRepository.findById(id).get();
  }
}
