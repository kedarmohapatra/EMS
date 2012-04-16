package com.example.ems.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.example.ems.domain.Job;

public class JobDaoImpl extends HibernateDaoSupport implements JobDao {

	@Override
	public Job get(String id) {
		return getHibernateTemplate().get(Job.class, id);
	}
	
	@Autowired
	public 	void setupSessionFactory(SessionFactory sessionFactory){
		setSessionFactory(sessionFactory);
	}

}
