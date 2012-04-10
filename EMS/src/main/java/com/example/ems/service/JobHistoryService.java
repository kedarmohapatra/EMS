package com.example.ems.service;

import java.util.List;

import com.example.ems.domain.JobHistory;

public interface JobHistoryService {

	List<JobHistory> get(int id);

}
