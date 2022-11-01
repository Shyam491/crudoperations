package com.shyam.spring.crudoper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.shyam.spring.crudoper.entity.Employee;
import com.spring.spring.crudoper.dao.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDAO;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDao employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	
	@Override
	@Transactional
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee find(int theId) {
		return employeeDAO.find(theId);
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		employeeDAO.save(theEmployee);
	}

	@Override
	@Transactional
	public void delete(int theId) {
		employeeDAO.delete(theId);
	}

}
