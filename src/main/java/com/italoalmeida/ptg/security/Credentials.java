package com.italoalmeida.ptg.security;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class Credentials implements Serializable {

	private static final long serialVersionUID = -6312209003181781376L;
	
	@NotNull
	@NotBlank
	@Email
	private Long phones;
	
	@NotNull
	@NotBlank
	private String password;

	public Credentials(Long phones, String password) {
		this.phones = phones;
		this.password = password;
	}

	public Long getPhones() {
		return phones;
	}

	public void setPhones(Long phones) {
		this.phones = phones;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
