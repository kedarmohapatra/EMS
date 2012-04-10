package com.example.ems.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.ems.domain.Department;

@Repository
public class DepartmentDaoImpl extends HibernateDaoSupport implements DepartmentDao {

	@Override
	public Department get(int id) {
		return getHibernateTemplate().get(Department.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Department> getAll() {
		return getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(Department.class).list();
	}

	@Autowired
	public void setupSessionFactory(SessionFactory sessionFactory){
		this.setSessionFactory(sessionFactory);
	}
}
