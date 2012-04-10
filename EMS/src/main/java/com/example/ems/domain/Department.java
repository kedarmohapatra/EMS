package com.example.ems.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Departments")
public class Department implements DomainObject {
	
	@Id
	@Column(name="department_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DEP_SEQ")
	@SequenceGenerator(name="DEP_SEQ", sequenceName="DEPARTMENTS_SEQ")
	private Integer departmentId;
	
	@Column(name="department_name")
	private String departmentName;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="manager_id")
	private Employee manager;
	
	@ManyToOne
	@JoinColumn(name="location_id")
	private Location location;
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Employee getManager() {
		return manager;
	}
	public void setManager(Employee manager) {
		this.manager = manager;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}

}
