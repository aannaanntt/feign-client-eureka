package com.training.employeeaddressservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.training.employeeaddressservice.model.Address;
import com.training.employeeaddressservice.model.Employee;

@Service
public class EmployeeAddressServiceImpl implements EmployeeAddressService {

	@Autowired
	EmployeeWebService empWebSevice;

	@Autowired
	AddressWebService addressWebService;

	@Override
	
	public List<Employee> getEmployees() {
		List<Employee> empList = empWebSevice.getEmployees();
		System.out.println();
		for (Employee employee : empList) {
			employee.setAddress(getAddress(employee));
		}
		return empList;
	}
	
	@HystrixCommand(fallbackMethod = "defaultAddress")
	public Address getAddress(Employee employee) {
		return addressWebService.getAddressByEmployeeId(employee.getId());
	}
	
	public Address defaultAddress(Employee employee) {
		return Address.builder().state("TN").street("HCL Street").city("CN").country("IN").id(-1).employeeId(-1).pincode("-1").build();
	}

	@Override
	public Employee addEmployeeAddress(Employee employee) {
		employee.setAddress(addressWebService.addEmployee(employee.getAddress()));
		return employee;
	}

}
