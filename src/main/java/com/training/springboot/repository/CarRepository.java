package com.training.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.training.springboot.model.Car;

public interface CarRepository extends CrudRepository<Car, Integer> {

	@Query(value="SELECT * FROM Car WHERE dealerUsername=:dealerUsername",nativeQuery=true)
	List<Car> viewCarByDealerUserName(@Param("dealerUsername") String dealerUsername);
	
	@Query(value="SELECT * FROM Car WHERE category=:category",nativeQuery=true)
	List<Car> viewCarByCategory(@Param("category") String category);
	
	@Query(value="SELECT DISTINCT Category FROM Car",nativeQuery=true)
	List<String> viewCarCategory();
	
}
