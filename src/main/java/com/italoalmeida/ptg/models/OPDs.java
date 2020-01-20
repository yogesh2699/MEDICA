package com.italoalmeida.ptg.models;


import com.sun.istack.internal.NotNull;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "opd")
public class OPDs implements Serializable {

    @Column(name="Date")
    private String date;

    @Column(name="username")
    private String username;

    @Column(name = "department")
    private String department;

    @Column(name = "phones")
    private String phones;

    @Column(name="Seats")
    private String Seats;

    @Column(name="price")
    private String price;

    @Column(name = "seatid")
    private  String seatid;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;

    public void setSeatid(String seatid) {
        this.seatid = seatid;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    public String getSeats() {
        return Seats;
    }

    public void setSeats(String seats) {
        Seats = seats;
    }

    public String getSeatid() {
        return seatid;
    }



    public OPDs(String date, String username, String department, String phones, String seats, String seatid) {
        this.date = date;
        this.username = username;
        this.department = department;
        this.phones = phones;
        Seats = seats;
        this.seatid = seatid;
    }

    public OPDs() {
    }

    @Override
    public String toString() {
        return "OPDs{" +
                "date='" + date + '\'' +
                ", username='" + username + '\'' +
                ", department='" + department + '\'' +
                ", phones='" + phones + '\'' +
                ", Seats=" + Seats +
                ", seatid=" + seatid +
                '}';
    }
}