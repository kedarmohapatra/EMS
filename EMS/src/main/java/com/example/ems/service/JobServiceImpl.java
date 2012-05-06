package com.example.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ems.dao.JobDao;
import com.example.ems.domain.Job;

@Service
public class JobServiceImpl implements JobService {

	private JobDao jobDao;
	
	@Override
	public List<Job> getAll() {
		return jobDao.getAll();
	}
	
	@Autowired
	public void setJobDao(JobDao jobDao) {
		this.jobDao = jobDao;
	}

}
