package com.example.ems.service;

import java.util.List;

import com.example.ems.domain.Department;

public interface DepartmentService {
	Department get(int id);
	List<Department> getAll();
}
