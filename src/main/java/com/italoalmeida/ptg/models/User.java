package com.italoalmeida.ptg.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name = "USER")
public class User implements Serializable {

	private static final long serialVersionUID = 3004049128350546151L;
	

	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String firstName;

	private String email;

	private String city;

	private String state;
	@NotNull
	private String password;

	@Id
	@NotNull
	@Column(name = "phones",unique = true)
	private String phones;
	

	



	private String age;


	private String gender;

	private String aadhaar;

	private String bloodgroup;


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public User() {
		super();
	}

	public User(String aadhaar, String bloodgroup) {
		this.aadhaar = aadhaar;
		this.bloodgroup = bloodgroup;
	}

	public User( String firstName,
				 String email,  String password,
				 String phones,  String age,  String gender) {
		super();
		this.firstName = firstName;
		this.email = email;
		this.password = password;
		this.phones = phones;
		this.age = age;
		this.gender = gender;
	}

	public long getId() {
		return id;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhones() {
		return phones;
	}

	public void setPhones(String phones) {
		this.phones = phones;
	}



	public String getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
}
