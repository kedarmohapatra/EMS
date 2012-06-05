package com.example.ems.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.ems.dao.DepartmentDao;
import com.example.ems.domain.Department;

@Component
public class DepartmentConverter implements Converter<String, Department>{

	@Autowired
	private DepartmentDao departmentDao;
	
	@Override
	public Department convert(String deptId) {
		return departmentDao.get(Integer.parseInt(deptId));
	}

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

}
