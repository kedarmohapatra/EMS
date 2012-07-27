package com.example.ems.domain.simple;

import com.example.ems.domain.Employee;
import com.example.ems.domain.Location;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: kedar-new
 * Date: 26/07/12
 * Time: 18:13
 * To change this template use File | Settings | File Templates.
 */
public class DeptOnly {

    @Id
    @Column(name="department_id")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="DEP_SEQ")
    @SequenceGenerator(name="DEP_SEQ", sequenceName="DEPARTMENTS_SEQ")
    private Integer departmentId;

    @Column(name="department_name")
    private String departmentName;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="manager_id")
    private Integer manager;

    @ManyToOne
    @JoinColumn(name="location_id")
    private Integer location;
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
    public Integer getManager() {
        return manager;
    }
    public void setManager(Integer manager) {
        this.manager = manager;
    }
    public Integer getLocation() {
        return location;
    }
    public void setLocation(Integer location) {
        this.location = location;
    }
}
