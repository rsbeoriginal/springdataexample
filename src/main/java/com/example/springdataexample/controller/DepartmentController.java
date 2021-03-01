package com.example.springdataexample.controller;

import com.example.springdataexample.dto.DepartmentRequestDto;
import com.example.springdataexample.dto.DepartmentResponseDto;
import com.example.springdataexample.dto.EmployeeResponseDto;
import com.example.springdataexample.entity.Department;
import com.example.springdataexample.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author rishi
 */
@RestController
@RequestMapping("/department")
public class DepartmentController {

  @Autowired
  private DepartmentService departmentService;

  @PostMapping
  public DepartmentResponseDto createDepartment
      (@RequestBody DepartmentRequestDto departmentRequestDto){
    return departmentService.createDepartment(departmentRequestDto);
  }

  @GetMapping("/{id}")
  public Department getDepartment(@PathVariable("id") Long id){
    return departmentService.getDepartmentById(id);
  }

  @PutMapping("/{id}")
  public DepartmentResponseDto updateDepartment
      (@PathVariable("id") Long departmentId,
          @RequestBody DepartmentRequestDto departmentRequestDto){
    return departmentService.updateDepartment(departmentId,departmentRequestDto);
  }

  @GetMapping("/{departmentId}/employee/mostExperienced")
  public List<EmployeeResponseDto> getMostExperiencedEmployeeListInDepartment(
      @PathVariable("departmentId") Long departmentId) {
    return departmentService.getMostExperiencedEmployeeListInDepartment(departmentId);
  }

  @GetMapping("/mostExperienced")
  public List<DepartmentResponseDto> getMostExperiencedDepartmentList(){
    return departmentService.getMostExperiencedDepartmentList();
  }
}
