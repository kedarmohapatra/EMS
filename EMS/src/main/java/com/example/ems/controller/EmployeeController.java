package com.example.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@RequestMapping("/search")
	public String showEmployeeSearchPage(){
		return "searchEmployee";
	}
	
}
