package com.italoalmeida.ptg.models;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "opdlab")
public class OPDLAB implements Serializable {

    @Column(name="Date")
    private String date;

    @Column(name="username")
    private String username;

    @Column(name = "lab")
    private String lab;

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

    public OPDLAB() {
    }

    public OPDLAB(String date, String username, String lab, String phones, String seats, String price, String seatid, long id) {
        this.date = date;
        this.username = username;
        this.lab = lab;
        this.phones = phones;
        Seats = seats;
        this.price = price;
        this.seatid = seatid;
        this.id = id;
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

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSeatid() {
        return seatid;
    }

    public void setSeatid(String seatid) {
        this.seatid = seatid;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "OPDLAB{" +
                "date='" + date + '\'' +
                ", username='" + username + '\'' +
                ", lab='" + lab + '\'' +
                ", phones='" + phones + '\'' +
                ", Seats='" + Seats + '\'' +
                ", price='" + price + '\'' +
                ", seatid='" + seatid + '\'' +
                ", id=" + id +
                '}';
    }
}
