package com.italoalmeida.ptg.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "cities")
public class States implements Serializable {


    @Id
    @Column(name = "city_id")
    private String cityid;

    @Column(name="city_name")
    private String name;


    @Column(name="city_state")
    private String state;

    public States() {
    }

    public States(String name, String state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "States{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}

