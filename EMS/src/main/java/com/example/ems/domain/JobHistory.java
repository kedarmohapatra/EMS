package com.example.ems.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="job_history")
public class JobHistory implements DomainObject {
	
	@EmbeddedId
	private JobHistoryId jobHistoryId;
	
	@Column(name="end_date")
	private Date endDate;
	
	@ManyToOne
	@JoinColumn(name="job_id")
	private Job job;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
	
	public JobHistoryId getJobHistoryId() {
		return jobHistoryId;
	}

	public void setJobHistoryId(JobHistoryId jobHistoryId) {
		this.jobHistoryId = jobHistoryId;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	
}