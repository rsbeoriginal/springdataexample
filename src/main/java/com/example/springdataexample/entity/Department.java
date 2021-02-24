package com.example.springdataexample.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author rishi
 */
@Entity
@Data
public class Department {

  @Id
  @GenericGenerator(name = "department_id_seq", strategy = "increment")
  @GeneratedValue(generator = "department_id_seq", strategy = GenerationType.AUTO)
  private Long id;

  private String name;

  //  @JoinColumn(referencedColumnName = "id", name = "department_id")
  //  @OneToMany
  //  List<Employee> employeeList;
}
