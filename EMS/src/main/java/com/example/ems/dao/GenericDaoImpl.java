package com.example.ems.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

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
	public E get(Integer id) {
		return (E) sessionFactory.getCurrentSession().get(type, id);
	}
	
	public void save(E element) {
		sessionFactory.getCurrentSession().save(element);
	}

	public void delete(E element) {
		sessionFactory.getCurrentSession().delete(element);
	}

	public void update(E element) {
		sessionFactory.getCurrentSession().update(element);
	}

}
