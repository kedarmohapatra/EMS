package com.example.ems.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ems.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/displaySearch")
	public String showEmployeeSearchPage(){
		return "empSearch";
	}
	
	@RequestMapping("/search")
	public String searchEmployee(HttpServletRequest request, ModelMap modelMap){
		modelMap.put("employees", employeeService.searchEmployee(request.getParameter("name")));
		return "empSearchResult";
	}
	
	@RequestMapping("/{id}")
	public String viewEmployee(@PathVariable int id ,ModelMap modelMap){
		modelMap.put("employee", employeeService.get(id));
		return "viewEmployee";
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}
	
}
