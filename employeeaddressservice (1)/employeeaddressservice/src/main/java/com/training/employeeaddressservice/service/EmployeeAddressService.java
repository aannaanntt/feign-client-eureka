package com.training.employeeaddressservice.service;

import java.util.List;

import com.training.employeeaddressservice.model.Address;
import com.training.employeeaddressservice.model.Employee;

public interface EmployeeAddressService {

	public List<Employee> getEmployees();
	public Employee addEmployeeAddress(Employee employee);
}
