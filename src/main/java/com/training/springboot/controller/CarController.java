package com.training.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.springboot.model.Car;
import com.training.springboot.service.CarService;

public class CarController {

	@Autowired
	CarService carService;
	
	// Add car
	@PostMapping("/dealer/cars")
	@ResponseBody
	public String addCar(Car car)
	{
		carService.addCar(car);
		return "Car Added Successfully!";
	}
	
	// View car by dealer username
	@GetMapping("/user/viewcarbydname/{dealerName}")
	@ResponseBody
	public List<Car> viewCarByDealerName(@PathVariable String dealerName)
	{
		return carService.viewCarByDealerName(dealerName);
	}
	
	// View car by category
	@GetMapping("/dealer/view/{category}")
	@ResponseBody
	public List<Car> viewCarByCategory(@PathVariable String category)
	{
		return carService.viewCarByDealerName(category);
	}
	
	// View car category
	@GetMapping("/car/view")
	@ResponseBody
	public List<String> viewCarCategory()
	{
		return carService.viewCarCategory();
	}
	
	// Delete Car
	@DeleteMapping("/dealer/car/{modelNo}")
	@ResponseBody
	public void deleteCar(int modelNo)
	{
		carService.deleteCar(modelNo);
	}
}
