package com.example.ems.dao;

public interface GenericDao<E> {
	E get(Integer id);
	
	public void save(E element) ;

	public void delete(E element);

	public void update(E element) ;
}
