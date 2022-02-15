package com.training.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Car {

	@Id
	@NotBlank(message = "Model number cannot be blank")
	private String modelNo;

	@NotBlank(message = "Car name cannot be blank")
	private String carName;

	@NotBlank(message = "Car category cannot be blank")
	private String category;

	@NotBlank(message = "Dealer username cannot be blank")
	private String dealerUsername;

	@NotNull(message = "Quantity cannot be blank")
	private int quantity;

	@Version
	private Long version;

	public Car() {
		super();
	}

	public Car(String modelNo, String carName, String category, String dealerUsername, int quantity, Long version) {
		super();
		this.modelNo = modelNo;
		this.carName = carName;
		this.category = category;
		this.dealerUsername = dealerUsername;
		this.quantity = quantity;
		this.version = version;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDealerUsername() {
		return dealerUsername;
	}

	public void setDealerUsername(String dealerUsername) {
		this.dealerUsername = dealerUsername;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

}
