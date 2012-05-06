package com.example.ems.service;

import java.util.List;

import com.example.ems.domain.Employee;

public interface EmployeeService {

	List<Employee> searchEmployee(String parameter);

	Employee get(int id);

	List<Employee> getAllManagers();

}
