package com.example.ems.domain.simple;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.util.Date;

@Entity
@Table(name="employees")
public class EmpOnly {
    private Integer empId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Date hireDate;
    private String job;
    private Float salary;
    private Float commissionPct;
    private Integer department;
    private Integer manager;

    @Id
    @Column(name="EMPLOYEE_ID")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="EMP_SEQ")
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
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
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
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }

    @Column(name="salary")
    @Digits(fraction = 2, integer = 8)
    public Float getSalary() {
        return salary;
    }
    public void setSalary(Float salary) {
        this.salary = salary;
    }

    @Column(name="commission_pct")
    @Digits(fraction = 2, integer = 8)
    public Float getCommissionPct() {
        return commissionPct;
    }
    public void setCommissionPct(Float commissionPct) {
        this.commissionPct = commissionPct;
    }

    @Column(name="department_id")
    public Integer getDepartment() {
        return department;
    }
    public void setDepartment(Integer department) {
        this.department = department;
    }

    @Column(name="manager_id")
    public Integer getManager() {
        return manager;
    }
    public void setManager(Integer manager) {
        this.manager = manager;
    }

    public String toString(){
        return firstName+lastName;
    }
}
