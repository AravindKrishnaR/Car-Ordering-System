package com.training.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	
	@NotBlank(message = "Dealer username cannot be blank")
	private String username;
	
	@NotBlank(message = "Car model number cannot be blank")
	private String modelNo;

	public Orders() {
		super();
	}

	public Orders(int orderId, String username, String modelNo) {
		super();
		this.orderId = orderId;
		this.username = username;
		this.modelNo = modelNo;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
}
