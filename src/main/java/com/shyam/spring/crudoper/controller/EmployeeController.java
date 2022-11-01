package com.shyam.spring.crudoper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shyam.spring.crudoper.entity.Employee;
import com.shyam.spring.crudoper.service.EmployeeService;
import com.spring.spring.crudoper.dao.EmployeeDao;

@RestController
public class EmployeeController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping("/getEmployees")
	public List<Employee> findAll() {
		return employeeService.findAll();
	}

}
