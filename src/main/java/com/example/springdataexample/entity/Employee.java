package com.example.springdataexample.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author rishi
 */
@Entity
@Getter
@Setter
public class Employee {

  @Id
  @GenericGenerator(name = "employee_id_seq", strategy = "increment")
  @GeneratedValue(generator = "employee_id_seq", strategy = GenerationType.AUTO)
  private Long id;

  private String name;

  @ManyToOne(cascade = CascadeType.ALL)
  private Department department;

}
