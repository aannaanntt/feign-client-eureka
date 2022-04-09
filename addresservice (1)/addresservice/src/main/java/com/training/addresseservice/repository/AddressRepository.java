package com.training.addresseservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.addresseservice.model.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
	//derived method/queries
	Address getAddressByEmployeeId(long employeeId);

}
