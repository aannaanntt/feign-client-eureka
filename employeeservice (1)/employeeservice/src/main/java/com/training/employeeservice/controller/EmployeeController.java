package com.training.employeeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.employeeservice.model.Employee;
import com.training.employeeservice.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	// CRUD
	// RequestMapping
	// Create --> PostMapping - completed
	// Read One--> GetMapping - completed
	// Read All--> GetMapping - completed
	// Update --> PutMapping - completed
	// Delete --> DeleteMapping - completed

	@GetMapping(value = "/employees")
	public List<Employee> getAllEmployees() {
		return employeeService.getEmployees();
	}

	@GetMapping(value = "/employee")
	// http://localhost:1234/employee/get?id=10
	// http://localhost:1234/employee/get?id=10&firstName=A - multiple variables
	public Employee getOneEmployee(@RequestParam long id) {
		return null;// employeeService.getOneEmployee(id);
	}

	@GetMapping(value = "/employee/{employeeid}")
	// http://localhost:1234/employee/2
	// do not give too many path variables
	public Employee getOneEmployeeById(@PathVariable long employeeid) {
		return null; // employeeService.getOneEmployee(employeeid);
	}

	@PostMapping(value = "/employee")
	public ResponseEntity createEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<>(employeeService.createEmployee(employee), HttpStatus.CREATED);
	}

	@PutMapping(value = "/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		System.out.println("Update the employee:" + employee);
		return null;// employeeService.updateEmployee(employee);
	}

	@DeleteMapping(value = "/employee/{employeeid}")
	public String deleteEmployeeById(@PathVariable long employeeid) {
		try {
			if (true) { // employeeService.deleteEmployee(employeeid)
				return "Deleted Successfully";
			}
		} catch (Exception e) {
		}
		return "Cannot able to delete the employee";

	}
}
