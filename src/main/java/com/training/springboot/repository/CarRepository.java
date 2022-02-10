package com.training.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.training.springboot.model.Car;

public interface CarRepository extends CrudRepository<Car, Integer> {

}
