package com.example.ems.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class JobHistoryId implements Serializable{
	
	private static final long serialVersionUID = -2652764778423008092L;
	
	@Column(name="employee_id")
	private Integer employeeId;
	@Column(name="start_date")
	private Date startDate;
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
}
