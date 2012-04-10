package com.example.ems.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.ems.domain.JobHistory;

@Repository
public class JobHistoryDaoImpl extends HibernateDaoSupport implements JobHistoryDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<JobHistory> get(int id) {
		return getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(JobHistory.class).add(Restrictions.eq("jobHistoryId.employeeId", id)).list();
	}

	@Autowired
	public void setupSessionDactory(SessionFactory sessionFactory){
		this.setSessionFactory(sessionFactory);
	}
}
