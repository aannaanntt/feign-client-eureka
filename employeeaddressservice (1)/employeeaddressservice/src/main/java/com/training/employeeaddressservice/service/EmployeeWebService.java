package com.training.employeeaddressservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.training.employeeaddressservice.model.Employee;

@FeignClient("EMPLOYEESERVICE")
public interface EmployeeWebService {
	
	@GetMapping("/employees")
	public List<Employee> getEmployees();
	
	@PostMapping("/employee")
	public Employee addEmployee(Employee employee);
}
