package com.example.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ems.service.JobHistoryService;

@Controller
@RequestMapping("/history")
public class JobHistoryController {

	@Autowired
	JobHistoryService historyService;
	
	@RequestMapping("/{id}")
	public String getHistoryForEmploye(@PathVariable int id, ModelMap modelMap){
		modelMap.put("history", historyService.get(id));
		return "viewHistory";
	}
	
	public void setHistoryService(JobHistoryService service){
		this.historyService=service;
	}
}
