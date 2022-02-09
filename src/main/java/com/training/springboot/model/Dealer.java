package com.training.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dealer {
	@Id
	private String username;
	private String dealerName;
	private String dealerAddress;
	private String email;
	private String phno;
	private String password;

	public Dealer() {
		super();
	}

	public Dealer(String username, String dealershipName, String dealershipAddress, String email, String phno,
			String password) {
		super();
		this.username = username;
		this.dealerName = dealershipName;
		this.dealerAddress = dealershipAddress;
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

	public String getDealershipName() {
		return dealerName;
	}

	public void setDealershipName(String dealershipName) {
		this.dealerName = dealershipName;
	}

	public String getDealershipAddress() {
		return dealerAddress;
	}

	public void setDealershipAddress(String dealershipAddress) {
		this.dealerAddress = dealershipAddress;
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
