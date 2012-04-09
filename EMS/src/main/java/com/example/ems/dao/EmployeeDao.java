package com.example.ems.dao;

import java.util.List;

import com.example.ems.domain.Employee;

public interface EmployeeDao {

	List<Employee> searchEmployee(String name);

}
