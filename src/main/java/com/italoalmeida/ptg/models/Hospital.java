package com.italoalmeida.ptg.models;



import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "HOSPITAL")
public class Hospital implements Serializable {




    @NotNull
    @Column(name="name")
    private String name;

    @NotNull
    @Column(name="type")
    private String type;

    @NotNull
    @Column(name="Address")
    private String Address;

    @Column(name="website")
    private String website;

    @NotNull
    @Column(name="HmisEnable")
    private String HmisEnable;

    @NotNull
    @Column(name="avgopd")
    private String AvgOpd;

    @NotNull
    @Column(name="noofdoc")
    private String NumOfDoc;

    @Column(name = "Govt")
     private String govt;

    @Id
    @NotNull
    @Column(name = "username",unique = true)
    private String Username;

    @Column(name = "password")
    private String password;

    @NotNull
    @Column(name="states")
    private String states;

    @NotNull
    @Column(name="city")
    private String city;

    @Column(name = "department")
    private String department;

    @Column(name = "doctors")
    private String doctors;

    @Column(name = "phones")
    private String phones;

    @Column(name = "lab")
    private String lab;

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public Hospital(String name, String type, String address, String website, String hmisEnable, String avgOpd, String numOfDoc, String govt, String username, String password, String states, String city, String department, String doctors, String phones, String lab) {
        this.name = name;
        this.type = type;
        Address = address;
        this.website = website;
        HmisEnable = hmisEnable;
        AvgOpd = avgOpd;
        NumOfDoc = numOfDoc;
        this.govt = govt;
        Username = username;
        this.password = password;
        this.states = states;
        this.city = city;
        this.department = department;
        this.doctors = doctors;
        this.phones = phones;
        this.lab = lab;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGovt() {
        return govt;
    }

    public void setGovt(String govt) {
        this.govt = govt;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDoctors() {
        return doctors;
    }

    public void setDoctors(String doctors) {
        this.doctors = doctors;
    }

    public Hospital(String city) {
        this.city = city;
    }




    public Hospital() {
        super();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getHmisEnable() {
        return HmisEnable;
    }

    public void setHmisEnable(String hmisEnable) {
        HmisEnable = hmisEnable;
    }

    public String getAvgOpd() {
        return AvgOpd;
    }

    public void setAvgOpd(String avgOpd) {
        AvgOpd = avgOpd;
    }

    public String getNumOfDoc() {
        return NumOfDoc;
    }

    public void setNumOfDoc(String numOfDoc) {
        NumOfDoc = numOfDoc;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getStates() {
        return states;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Hospital{" +

                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", Address='" + Address + '\'' +
                ", website='" + website + '\'' +
                ", HmisEnable='" + HmisEnable + '\'' +
                ", AvgOpd=" + AvgOpd +
                ", NumOfDoc=" + NumOfDoc +
                ", govt='" + govt + '\'' +
                ", Username='" + Username + '\'' +
                ", states='" + states + '\'' +
                ", city='" + city + '\'' +
                ", department='" + department + '\'' +
                ", doctors='" + doctors + '\'' +
                '}';
    }
}
