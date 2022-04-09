package com.training.addresseservice.service;

import java.util.List;

import com.training.addresseservice.model.Address;

public interface AddressService {
	public List<Address> getAddresses();
	public Address createAddress(Address employee);
	public Address getAddressByEmployeeId(long employeeId);
}
