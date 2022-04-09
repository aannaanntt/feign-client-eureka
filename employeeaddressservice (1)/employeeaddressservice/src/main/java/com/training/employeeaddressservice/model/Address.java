package com.training.employeeaddressservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	private long id;
	private String street;
	private String city;
	private String state;
	private String country;
	private String pincode;
	private long employeeId;
}
