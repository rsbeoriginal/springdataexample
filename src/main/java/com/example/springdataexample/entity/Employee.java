package com.example.springdataexample.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author rishi
 */
@Entity
@Getter
@Setter
public class Employee {

  @Id
  private Long id;

  private String name;

  private String departmentName;

}
