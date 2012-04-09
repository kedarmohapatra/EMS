package com.example.ems.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.ems.domain.Employee;

@Repository
public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> searchEmployee(String name) {
		List<Employee> employees = getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(Employee.class).add(Restrictions.ilike("first_name", "%"+name+"%")).list();
//		List<String> employees = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("select emp from Employee emp").list();
		return employees;
	}
	
	@Autowired
	public void setupSessionFactory(SessionFactory factory){
		this.setSessionFactory(factory);
	}
}
