package com.example.springdataexample.service.impl;

import com.example.springdataexample.dto.EmployeeRequestDto;
import com.example.springdataexample.dto.EmployeeResponseDto;
import com.example.springdataexample.entity.Employee;
import com.example.springdataexample.repository.EmployeeRepository;
import com.example.springdataexample.service.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rishi
 */
@Service
public class EmployeeServiceImpl
    implements EmployeeService {

  @Autowired
  private EmployeeRepository employeeRepository;

  @Override
  public EmployeeResponseDto createEmployee(EmployeeRequestDto employeeRequestDto) {
    Employee employee = new Employee();

    //copy fields from dto to employee
    BeanUtils.copyProperties(employeeRequestDto, employee);

    //save employee to db
    Employee savedEmployee = employeeRepository.save(employee);

    // copy from employee to response dto
    EmployeeResponseDto responseDto = new EmployeeResponseDto();
    BeanUtils.copyProperties(savedEmployee, responseDto);


    return responseDto;
  }

}
