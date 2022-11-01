package com.shyam.spring.crudoper.service;

import java.util.List;

import com.shyam.spring.crudoper.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> findAll();
	
	public Employee find(int theId);
	
	public void save(Employee theEmployee);
	
	public void delete(int theId);

}
