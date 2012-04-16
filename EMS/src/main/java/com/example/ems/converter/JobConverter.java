package com.example.ems.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.ems.dao.JobDao;
import com.example.ems.domain.Job;

@Component
public class JobConverter implements Converter<String, Job> {

	@Autowired
	private JobDao jobDao;
	
	@Override
	public Job convert(String jobId) {
		return jobDao.get(jobId);
	}

	public void setJobDao(JobDao jobDao) {
		this.jobDao = jobDao;
	}

}
