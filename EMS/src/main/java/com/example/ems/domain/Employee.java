package com.example.ems.domain;

import java.util.Date;

import javax.persistence.Table;

import org.hibernate.annotations.Entity;


@Entity
@Table(name="employees")
public class Employee extends DomainObject{
	private int empId;
	private String firstName;
	private String lastName;
	private String email;
	private int phoneNumber;
	private Date hireDate;
	private String jobId;
	private float salary;
	private float commissionPct;
	private int departmentId;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getCommissionPct() {
		return commissionPct;
	}
	public void setCommissionPct(float commissionPct) {
		this.commissionPct = commissionPct;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

}
