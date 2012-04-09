package com.example.ems.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.ems.domain.Employee;
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
	public ModelAndView searchEmployee(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView("empSearchResult");
		List<Employee> employees = employeeService.searchEmployee(request.getParameter("name"));
		modelAndView.addObject("employees", employees);
		return modelAndView;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}
	
}
