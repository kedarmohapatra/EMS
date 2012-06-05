package com.example.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ems.service.DepartmentService;

@Controller
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	
	@RequestMapping("/{id}")
	public String getDepartmentById(@PathVariable int id, ModelMap modelMap){
		modelMap.put("department", departmentService.get(id));
		modelMap.put("totalEmployees", departmentService.getEmployeesInDepartment(id));
		return "viewDepartment";
	}
}
