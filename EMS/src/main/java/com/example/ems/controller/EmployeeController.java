package com.example.ems.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ems.domain.Employee;
import com.example.ems.service.DepartmentService;
import com.example.ems.service.EmployeeService;
import com.example.ems.service.JobService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private JobService jobService;
	@Autowired
	private DepartmentService departmentService;

	@RequestMapping("/displaySearch")
	public String showEmployeeSearchPage(){
		return "empSearch";
	}
	
	@RequestMapping("/displayAjaxSearch")
	public String showEmployeeAjaxSearchPage(){
		return "searchAjax";
	}
	
	@RequestMapping("/search")
	public String searchEmployee(HttpServletRequest request, ModelMap modelMap){
		modelMap.put("employees", employeeService.searchEmployee(request.getParameter("name"), request.getParameter("start")));
		return "empSearchResult";
	}
	
	@RequestMapping("/{id}")
	public String viewEmployee(@PathVariable int id ,ModelMap modelMap){
		modelMap.put("employee", employeeService.get(id));
		return "viewEmployee";
	}
	
	@RequestMapping("/update/{id}")
	public String updateEmployee(@PathVariable int id ,@ModelAttribute Employee command){
		command=new Employee();
		return "updateEmployee";
	}
	
	@RequestMapping("/add")
	public String addEmployee(ModelMap modelMap){
		modelMap.put("jobs", jobService.getAll());
		modelMap.put("departments", departmentService.getAll());
		modelMap.put("managers", employeeService.getAllManagers());
		return "addEmployee";
	}
	
	@RequestMapping("/addSuccess")
	public String addEmployeeSuccess(@Valid Employee command, ModelMap modelMap){
		employeeService.save(command);
		modelMap.put("jobs", jobService.getAll());
		modelMap.put("departments", departmentService.getAll());
		modelMap.put("managers", employeeService.getAllManagers());
		return "addEmployee";
	}
	
	@RequestMapping("/searchAjax")
	public String searchAjax(HttpServletRequest request, ModelMap modelMap){
		modelMap.put("employees", employeeService.searchEmployee(request.getParameter("name"), request.getParameter("start")));
		return "empSearchResult";
	}
	
	@RequestMapping("/export/{id}")
	public String exportEmployee(@PathVariable int id ,HttpServletResponse response, ModelMap modelMap){
		response.setContentType("text/xml");
		modelMap.put("employee", employeeService.get(id));
		return "viewEmployee";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		dateFormat.setLenient(false);
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/mm/yyyy");
		dateFormat1.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, false));
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat1, false));
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService=employeeService;
	}

	public void setJobService(JobService jobService) {
		this.jobService = jobService;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	
}
