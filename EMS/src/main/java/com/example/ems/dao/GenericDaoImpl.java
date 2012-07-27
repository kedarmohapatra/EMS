package com.example.ems.dao;

import org.hibernate.LockOptions;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class GenericDaoImpl <E> implements GenericDao<E>{
	
	private Class<E> type;
	
	@Autowired
	protected SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public GenericDaoImpl(Class<E> type){
		this.type = type;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(propagation=Propagation.REQUIRES_NEW, isolation=Isolation.DEFAULT)
	public E get(Integer id) {
		E element = (E) sessionFactory.getCurrentSession().get(type, id, LockOptions.UPGRADE);
		return element;
	}
	
	public void save(E element) {
		sessionFactory.getCurrentSession().save(element);
	}

	public void delete(E element) {
		sessionFactory.getCurrentSession().delete(element);
	}

	@Transactional(propagation=Propagation.SUPPORTS, isolation=Isolation.DEFAULT)
	public void update(E element) {
		sessionFactory.getCurrentSession().merge(element);
	}

}
