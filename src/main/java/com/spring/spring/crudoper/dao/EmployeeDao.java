package com.spring.spring.crudoper.dao;

import java.util.List;

import com.shyam.spring.crudoper.entity.Employee;

public interface EmployeeDao {
	
	public List<Employee> findAll();
	
	public Employee find(int theId);
	
	public void save(Employee employee);
	
	public void delete(int theId);

}
