package com.training.springboot.model;

public class Dealer {
	private String username;
	private String dealershipName;
	private String dealershipAddress;
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
		this.dealershipName = dealershipName;
		this.dealershipAddress = dealershipAddress;
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
		return dealershipName;
	}

	public void setDealershipName(String dealershipName) {
		this.dealershipName = dealershipName;
	}

	public String getDealershipAddress() {
		return dealershipAddress;
	}

	public void setDealershipAddress(String dealershipAddress) {
		this.dealershipAddress = dealershipAddress;
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
