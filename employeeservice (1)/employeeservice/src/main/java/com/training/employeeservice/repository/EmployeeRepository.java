package com.training.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.employeeservice.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
