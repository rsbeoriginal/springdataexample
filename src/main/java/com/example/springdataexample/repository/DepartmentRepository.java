package com.example.springdataexample.repository;

import com.example.springdataexample.entity.Department;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author rishi
 */
public interface DepartmentRepository extends CrudRepository<Department, Long> {

  @Query(value = "select * from department where id = (select department_id FROM employee GROUP BY "
             + "department_id ORDER BY SUM(years_of_experience) desc limit 1)", nativeQuery = true)
  List<Department> getMostExperiencedDepartmentList();

  @Query(value = "SELECT d.id,d.name FROM department d "
      + "join employee e on d.id = e.department_id "
      + "GROUP BY (d.id) "
      + "ORDER BY SUM(e.years_of_experience) DESC "
      + "LIMIT 1", nativeQuery = true)
  List<Department> getMostExperiencedDepartmentListByJoinQuery();

}
