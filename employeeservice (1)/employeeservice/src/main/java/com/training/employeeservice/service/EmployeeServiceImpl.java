package com.training.employeeservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.employeeservice.model.Employee;
import com.training.employeeservice.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository empRepository;
	
	@Override
	public List<Employee> getEmployees() {
		return empRepository.findAll();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		return empRepository.save(employee);
	}

}
