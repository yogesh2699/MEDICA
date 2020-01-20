package com.italoalmeida.ptg.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Appointmentlab")
public class AppointmentLab {

    @Id
    @Column(name="id")
    private String id;

    @Column(name="name")
    private String name;

    @Column(name="gender")
    private String gender;

    @Column(name="dob")
    private String dob;

    @Column(name="aadhaar")
    private String aadhaar;

    @Column(name="fathername")
    private String fathername;

    @Column(name="mothername")
    private String mothername;

    @Column(name="email")
    private String email;

    @Column(name="address")
    private String address;

    @Column(name="state")
    private String state;

    @Column(name="pincode")
    private String pincode;

    @Column(name = "phones")
    private String phones;

    @Column(name = "status")
    private String status;


    @Column(name = "reporturl")
    private String reporturl;

    public AppointmentLab(String id, String name, String gender, String dob, String aadhaar, String fathername, String mothername, String email, String address, String state, String pincode, String phones, String status) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.aadhaar = aadhaar;
        this.fathername = fathername;
        this.mothername = mothername;
        this.email = email;
        this.address = address;
        this.state = state;
        this.pincode = pincode;
        this.phones = phones;
        this.status = status;
    }


    public AppointmentLab() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAadhaar() {
        return aadhaar;
    }

    public void setAadhaar(String aadhaar) {
        this.aadhaar = aadhaar;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getMothername() {
        return mothername;
    }

    public void setMothername(String mothername) {
        this.mothername = mothername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReporturl() {
        return reporturl;
    }

    public void setReporturl(String reporturl) {
        this.reporturl = reporturl;
    }
}
