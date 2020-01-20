package com.italoalmeida.ptg.models;


import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "DOCTORS")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;


    @Column(name="name")
    private String name;

    @Column(name="age")
    private String age;

    @Column(name="department")
    private String department;

    @Column(name="qualification")
    private String qualification;

    @Column(name="username")
    private String username;

    @Column(name="workingdays")
    private String workingdays;

    @Column(name="fees")
    private String fees;


    public Doctor(String workingdays, String fees) {
        this.workingdays = workingdays;
        this.fees = fees;
    }

    public String getWorkingdays() {
        return workingdays;
    }

    public void setWorkingdays(String workingdays) {
        this.workingdays = workingdays;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Doctor(long id, String name, String age, String department, String qualification, String username) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.qualification = qualification;
        this.username = username;
    }

    public Doctor() {
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", department='" + department + '\'' +
                ", qualification='" + qualification + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
