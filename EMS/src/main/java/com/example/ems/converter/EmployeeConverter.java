package com.example.ems.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.ems.dao.EmployeeDao;
import com.example.ems.domain.Employee;

@Component
public class EmployeeConverter implements Converter<String, Employee>{

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public Employee convert(String empId) {
		return employeeDao.get(Integer.parseInt(empId));
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

}
