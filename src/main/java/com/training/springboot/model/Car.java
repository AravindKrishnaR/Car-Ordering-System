package com.training.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Car {

	@Id
	@NotBlank(message = "Model number cannot be blank")
	private int modelNo;
	
	@NotBlank(message = "Car name cannot be blank")
	private String carName;
	
	@NotBlank(message = "Car category cannot be blank")
	private String category;
	
	@NotBlank(message = "Dealer username cannot be blank")
	private String dealerUsername;

	public Car() {
		super();
	}

	public Car(int modelNo, String carName, String category, String dealerUsername) {
		super();
		this.modelNo = modelNo;
		this.carName = carName;
		this.category = category;
		this.dealerUsername = dealerUsername;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
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

}
