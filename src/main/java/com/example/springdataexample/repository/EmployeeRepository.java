package com.example.springdataexample.repository;

import com.example.springdataexample.entity.Department;
import com.example.springdataexample.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author rishi
 */
public interface EmployeeRepository
    extends CrudRepository<Employee, Long> {


  //by method name
  List<Employee> findByDepartment(Department department);

  List<Employee> findByDepartment_Id(Long departmentId);

  //by @Query annotation
  @Query("SELECT e FROM Employee e WHERE e.department.id = ?1")
//  @Query("FROM Employee e WHERE e.department.id = ?1")
  List<Employee> getEmployeeListByDepartmentId(Long departmentId);

  @Query("SELECT e FROM Employee e WHERE e.department.id = :departmentId")
    //  @Query("FROM Employee e WHERE e.department.id = ?1")
  List<Employee> getEmployeeListByDepartmentIdParam(@Param("departmentId") Long departmentId);


  //by native query

  @Query(value = "SELECT * FROM employee e WHERE e.department_id = ?1",
         nativeQuery = true)
  List<Employee> getEmployeeListByNativeQuery(Long departmentId);

  @Query("FROM Employee e WHERE e.yearsOfExperience = (SELECT max(emp1.yearsOfExperience) FROM Employee emp1)")
  List<Employee> getMostExperiencedEmployeeList();

  @Query("FROM Employee e WHERE e.department.id = ?1 AND "
             + "e.yearsOfExperience = (SELECT max(emp1.yearsOfExperience) FROM Employee emp1 WHERE emp1.department.id = ?1)")
  List<Employee> getMostExperiencedEmployeeListInDepartment(Long departmentId);
}
