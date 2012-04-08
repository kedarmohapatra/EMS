package com.example.ems.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.ems.domain.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@RequestMapping("/displaySearch")
	public String showEmployeeSearchPage(){
		return "empSearch";
	}
	
	@RequestMapping("/search")
	public ModelAndView searchEmployee(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView("empSearchResult");
		List<Employee>
		return modelAndView;
	}
	
}
