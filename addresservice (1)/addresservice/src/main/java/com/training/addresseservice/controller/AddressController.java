package com.training.addresseservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.addresseservice.model.Address;
import com.training.addresseservice.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService addressService;

	@GetMapping(value = "/address/emp/{employeeId}")
	// http://localhost:1234/address/2
	// do not give too many path variables
	public Address getEmployeeAddressById(@PathVariable long employeeId) {
		System.out.println("I am invoked for empId:" + employeeId);
		return addressService.getAddressByEmployeeId(employeeId);
	}

	@PostMapping(value = "/address")
	public ResponseEntity createAddress(@RequestBody Address address) {
		System.out.println(address);
		return new ResponseEntity<>(addressService.createAddress(address), HttpStatus.CREATED);
	}

}
