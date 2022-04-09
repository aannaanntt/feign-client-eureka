package com.training.employeeservice.service;

import java.util.List;

import com.training.employeeservice.model.Employee;

public interface EmployeeService {
	public List<Employee> getEmployees();
	public Employee createEmployee(Employee employee);
}
