package com.example.ems.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.ems.domain.Job;
@Repository
public class JobDaoImpl extends HibernateDaoSupport implements JobDao {

	@Override
	public Job get(String id) {
		return getHibernateTemplate().get(Job.class, id);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Job> getAll() {
		return getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(Job.class).list();
	}
	
	@Autowired
	public 	void setupSessionFactory(SessionFactory sessionFactory){
		setSessionFactory(sessionFactory);
	}

}
