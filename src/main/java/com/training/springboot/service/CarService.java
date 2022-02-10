package com.training.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springboot.model.Car;
import com.training.springboot.repository.CarRepository;

@Service
public class CarService {

	@Autowired
	CarRepository carRepository;

	// Add car
	public void addCar(Car car) {
		carRepository.save(car);
	}

	// View car by dealer username
	public List<Car> viewCarByDealerName(String dealerName) {
		List<Car> carList = new ArrayList<Car>();
		carRepository.viewCarByDealerUserName(dealerName).forEach(car -> carList.add(car));
		return carList;
	}

	// View car by category
	public List<Car> viewCarByCategory(String category) {
		List<Car> carList = new ArrayList<Car>();
		carRepository.viewCarByCategory(category).forEach(car -> carList.add(car));
		return carList;
	}

	// View car category
	public List<String> viewCarCategory() {
		List<String> categoryList = new ArrayList<String>();
		carRepository.viewCarCategory().forEach(category -> categoryList.add(category));
		return categoryList;
	}

	// Delete Car
	public void deleteCar(int modelNo) {
		carRepository.deleteById(modelNo);
	}
}
