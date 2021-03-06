package com.training.employeeaddressservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private long id;
	private String empName;
	private float salary;
	private Address address;
}
