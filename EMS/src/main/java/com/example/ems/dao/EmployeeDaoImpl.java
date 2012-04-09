package com.example.ems.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.ems.domain.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> searchEmployee(String name) {
		List<Employee> employees = sessionFactory.getCurrentSession().createCriteria(Employee.class).add(Restrictions.or(Restrictions.ilike("last_name", name), Restrictions.ilike("first_name", name))).list();
		return employees;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
