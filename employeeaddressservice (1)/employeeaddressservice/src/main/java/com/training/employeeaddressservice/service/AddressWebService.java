package com.training.employeeaddressservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.training.employeeaddressservice.model.Address;

@FeignClient("ADDRESSERVICE")
public interface AddressWebService {
	
	@GetMapping("/address/emp/{employeeId}")
	//@HystrixCommand(fallbackMethod = "getAddressByEmployeeId_Fallback")
	public Address getAddressByEmployeeId(@PathVariable long employeeId);
	
	public static Address getAddressByEmployeeId_Fallback(@PathVariable long employeeId) {
		return new Address();
	}	
	
	@PostMapping("/address")
	public Address addEmployee(Address address);
}
