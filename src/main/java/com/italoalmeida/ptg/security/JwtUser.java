package com.italoalmeida.ptg.security;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.italoalmeida.ptg.models.Phone;
import com.italoalmeida.ptg.models.User;


public class JwtUser implements Serializable {

	private static final long serialVersionUID = -874071359709399690L;
	
	private String firstName;

	private String email;
	
	private String phones;
	


	private String gender;

	private String age;
	
	public JwtUser() {
	}

	public JwtUser(User user) {
		this.firstName = user.getFirstName();
		this.email = user.getEmail();
		this.phones = user.getPhones();

		this.age = user.getAge();
		this.gender = user.getGender();
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
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

	public String getPhones() {
		return phones;
	}

	public void setPhones(String phones) {
		this.phones = phones;
	}


}
