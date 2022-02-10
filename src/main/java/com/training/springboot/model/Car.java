package com.training.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {

	@Id
	private int modelNo;
	private String carName;
	private String category;

	public Car() {
		super();
	}

	public Car(int modelNo, String carName, String category) {
		super();
		this.modelNo = modelNo;
		this.carName = carName;
		this.category = category;
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

}
