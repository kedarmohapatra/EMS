package com.example.ems.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kedar-new
 * Date: 26/07/12
 * Time: 20:20
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="employees")
public class Manager {
    private Integer empId;
    private String firstName;
    private String lastName;

    @OneToMany(fetch=FetchType.LAZY)
    @JoinColumn(name="manager_id")
    public List<Employee> getReportees() {
        return reportees;
    }

    public void setReportees(List<Employee> reportees) {
        this.reportees = reportees;
    }

    private List<Employee> reportees;

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
}
