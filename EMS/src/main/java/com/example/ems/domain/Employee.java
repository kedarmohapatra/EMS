package com.example.ems.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Entity;


@Entity
@Table(name="employees")
public class Employee extends DomainObject{
	private Integer empId;
	private String firstName;
	private String lastName;
	private String email;
	private Integer phoneNumber;
	private Date hireDate;
	private String jobId;
	private Float salary;
	private Float commissionPct;
	private Integer departmentId;
	
	@Id
	@Column(name="EMPLOYEE_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMP_SEQ")
	@SequenceGenerator(name="EMP_SEQ", allocationSize=10, sequenceName="EMPLOYEES_SEQ")
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	
	@Column(name="first_name")
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name="last_name")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name="email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name="phone_number")
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Column(name="hire_date")
	@Temporal(TemporalType.DATE)
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	@Column(name="job_id")
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	
	@Column(name="salary", length=8, precision=2)
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	
	@Column(name="commission_pct", length=2, precision=2)
	public Float getCommissionPct() {
		return commissionPct;
	}
	public void setCommissionPct(Float commissionPct) {
		this.commissionPct = commissionPct;
	}
	
	@Column(name="department_id")
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

}
