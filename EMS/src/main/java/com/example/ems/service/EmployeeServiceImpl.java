package com.example.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.ems.dao.EmployeeDao;
import com.example.ems.domain.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	@Cacheable("employee")
	public List<Employee> searchEmployee(String name, String start) {
		return employeeDao.searchEmployee(name, start);
	}
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	@Override
	public Employee get(int id) {
		return employeeDao.get(id);
	}
	@Override
	@Cacheable("employee")
	public List<Employee> getAllManagers() {
		return employeeDao.searchEmployee("", null);
	}
	
	@Transactional(readOnly = false, isolation = Isolation.DEFAULT, propagation= Propagation.SUPPORTS)
	@Override
	public void save(Employee employee) {
		employeeDao.save(employee);
		
	}
	@Override
	public void update(Employee employee) {
		employeeDao.update(employee);
		
	}

}
