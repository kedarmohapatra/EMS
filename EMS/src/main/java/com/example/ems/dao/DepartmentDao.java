package com.example.ems.dao;

import java.util.List;

import com.example.ems.domain.Department;

public interface DepartmentDao {

	Department get(int id);
	List<Department> getAll();
	int getEmployeesInDepartment(int id);
}
