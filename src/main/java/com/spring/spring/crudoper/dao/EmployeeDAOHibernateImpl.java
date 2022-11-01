package com.spring.spring.crudoper.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.shyam.spring.crudoper.entity.Employee;

public class EmployeeDAOHibernateImpl implements EmployeeDao {

	// define field for entity manager
	private EntityManager entityManager;

	// set-up constructor injection
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Employee> findAll() {
		// create session
		Session currentSession = entityManager.unwrap(Session.class);

		// Create Query
		Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);

		// Creating Query and getting result
		List<Employee> employees = theQuery.getResultList();

		return employees;
	}

	@Override
	public Employee find(int theId) {

		Session currentSession = entityManager.unwrap(Session.class);

		Employee employee = currentSession.get(Employee.class, theId);

		return employee;
	}

	@Override
	public void save(Employee employee) {
		Session currentSession = entityManager.unwrap(Session.class);

		currentSession.saveOrUpdate(employee);
	}

	@Override
	public void delete(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);

		Employee theEmployee = currentSession.get(Employee.class, theId);

		currentSession.delete(theEmployee);

	}

}
