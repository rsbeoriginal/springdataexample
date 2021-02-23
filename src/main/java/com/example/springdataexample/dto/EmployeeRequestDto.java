package com.example.springdataexample.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author rishi
 */
@Getter
@Setter
public class EmployeeRequestDto {

  private Long id;

  private String name;

  private String departmentName;
}
