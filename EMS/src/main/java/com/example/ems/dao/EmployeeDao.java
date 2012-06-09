package com.example.ems.dao;

import java.util.List;

import com.example.ems.domain.Employee;

public interface EmployeeDao extends GenericDao<Employee>{

	List<Employee> searchEmployee(String name, String start);

}
