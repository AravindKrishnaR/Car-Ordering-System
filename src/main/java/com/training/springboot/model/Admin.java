package com.training.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
public class Admin {
	@Id
	private String username;
	
	@NotBlank(message = "Email cannot be blank")
	@Email(message = "Invalid email")
	private String email;
	
	@NotBlank(message = "Password cannot be blank")
	private String password;

	public Admin() {
		super();
	}

	public Admin(String username, String email, String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

}
