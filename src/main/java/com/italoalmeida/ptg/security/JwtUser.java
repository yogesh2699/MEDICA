package com.italoalmeida.ptg.security;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.italoalmeida.ptg.models.Phone;
import com.italoalmeida.ptg.models.User;


public class JwtUser implements Serializable {

	private static final long serialVersionUID = -874071359709399690L;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private Long phones;
	
	private Date created_at;
	
	private Date last_login;

	private String gender;

	private Integer age;
	
	public JwtUser() {
	}

	public JwtUser(User user) {
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
		this.email = user.getEmail();
		this.phones = user.getPhones();
		this.created_at = user.getCreated_at();
		this.last_login = user.getLast_login();
		this.age = user.getAge();
		this.gender = user.getGender();
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhones() {
		return phones;
	}

	public void setPhones(Long phones) {
		this.phones = phones;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getLast_login() {
		return last_login;
	}

	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}
	
}
