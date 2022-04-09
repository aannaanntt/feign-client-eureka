package com.training.employeeaddressservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.employeeaddressservice.model.Address;
import com.training.employeeaddressservice.model.Employee;
import com.training.employeeaddressservice.service.EmployeeAddressService;

@RestController
public class EmployeeAddressController {
	
	@Autowired
	EmployeeAddressService empAddressService;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return empAddressService.getEmployees();
	}
	
	@PostMapping("/address")
	public Employee createAddress(@RequestBody Employee employee) {
		return empAddressService.addEmployeeAddress(employee);
	}
	
}
