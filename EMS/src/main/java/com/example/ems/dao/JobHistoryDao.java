package com.example.ems.dao;

import java.util.List;

import com.example.ems.domain.JobHistory;

public interface JobHistoryDao {
	List<JobHistory> get(int id);
}
