package com.training.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class User {
	@Id
	@NotBlank(message = "Username cannot be blank")
	private String username;

	@NotBlank(message = "Email cannot be blank")
	@Email(message = "Invalid email")
	private String email;

	@NotBlank(message = "Phone number cannot be blank")
	@Pattern(regexp = "^[6789]\\d{9}$", message = "Invalid phone number")
	private String phno;

	@NotBlank(message = "Password cannot be blank")
	@Pattern(regexp = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}", message = "Password length must be atleast 8 characters and must contain atleast 1 digit, 1 lowercase alphabet, 1 uppercase alphabet, 1 special character and no white spaces.")
	private String password;

	public User() {
		super();
	}

	public User(String username, String email, String phno, String password) {
		super();
		this.username = username;
		this.email = email;
		this.phno = phno;
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

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
