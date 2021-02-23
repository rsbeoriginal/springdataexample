package com.example.springdataexample.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

/**
 * @author rishi
 */
@Document
@Getter
@Setter
public class Employee {

  @MongoId
  private Long id;

  private String name;

  private String departmentName;

}
