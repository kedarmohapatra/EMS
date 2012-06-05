package com.example.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ems.dao.DepartmentDao;
import com.example.ems.domain.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentDao departmentDao;
	
	@Override
	public Department get(int id) {
		return departmentDao.get(id);
	}

	@Override
	public List<Department> getAll() {
		return departmentDao.getAll();
	}

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	@Override
	public int getEmployeesInDepartment(int id) {
		return departmentDao.getEmployeesInDepartment(id);
	}

}
