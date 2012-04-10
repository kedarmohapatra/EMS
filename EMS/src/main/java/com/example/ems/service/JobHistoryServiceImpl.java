package com.example.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ems.dao.JobHistoryDao;
import com.example.ems.domain.JobHistory;

@Service
public class JobHistoryServiceImpl implements JobHistoryService {

	@Autowired
	JobHistoryDao jobHistoryDao;
	
	@Override
	public List<JobHistory> get(int id) {
		return jobHistoryDao.get(id);
	}

	public void setJobHistoryDao(JobHistoryDao jobHistoryDao) {
		this.jobHistoryDao = jobHistoryDao;
	}

}
