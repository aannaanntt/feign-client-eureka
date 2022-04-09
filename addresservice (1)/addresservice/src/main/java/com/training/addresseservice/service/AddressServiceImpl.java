package com.training.addresseservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.addresseservice.model.Address;
import com.training.addresseservice.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressRepository empRepository;
	
	@Override
	public List<Address> getAddresses() {
		return empRepository.findAll();
	}

	@Override
	public Address createAddress(Address employee) {
		return empRepository.save(employee);
	}

	@Override
	public Address getAddressByEmployeeId(long employeeId) {
		return empRepository.getAddressByEmployeeId(employeeId);
	}

}
