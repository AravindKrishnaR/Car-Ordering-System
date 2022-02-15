package com.training.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.model.Car;
import com.training.springboot.service.CarService;

@RestController
public class CarController {

	@Autowired
	CarService carService;
	
	// Add car
	@PostMapping("/dealer/cars")
	public String addCar(@RequestBody Car car)
	{
		carService.addCar(car);
		return "Car Added Successfully!";
	}
	
	// View car by dealer username
	@GetMapping("/dealer/view/{dealerName}")
	public List<Car> viewCarByDealerName(@PathVariable String dealerName)
	{
		return carService.viewCarByDealerName(dealerName);
	}
	
	// View car by category
	@GetMapping("/car/categories/{category}")
	public List<Car> viewCarByCategory(@PathVariable String category)
	{
		return carService.viewCarByCategory(category);
	}
	
	//View car by model no
	@GetMapping("/car/{modelNo}")
	public Car viewCarByModelNo(@PathVariable String modelNo) {
		return carService.viewCarByModelNo(modelNo);
	}
	
	// View car category
	@GetMapping("/car/categories")
	@ResponseBody
	public List<String> viewCarCategory()
	{
		return carService.viewCarCategory();
	}
	
	// Delete Car
	@DeleteMapping("/dealer/car/{modelNo}")
	public void deleteCar(@PathVariable int modelNo)
	{
		carService.deleteCar(modelNo);
	}
}
