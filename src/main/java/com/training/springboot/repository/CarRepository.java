package com.training.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.training.springboot.model.Car;

public interface CarRepository extends CrudRepository<Car, Integer> {

//	@Query(value = "SELECT * FROM Car WHERE dealer_username = :dealerUsername ", nativeQuery = true)
//	List<Car> viewCarByDealerUserName(@Param("dealerUsername") String dealerUsername);
	
	List<Car> findByDealerUsername(String dealerUsername);

//	@Query(value = "SELECT * FROM Car WHERE category = :category ", nativeQuery = true)
//	List<Car> viewCarByCategory(@Param("category") String category);
	
	List<Car> findByCategory(String category);
	
//	@Query(value = "SELECT * FROM Car WHERE model_no = :modelNo ", nativeQuery = true)
//	Car viewCarByModelNo(@Param("modelNo") String modelNo);
	
	Car findByModelNo(@Param("modelNo") String modelNo);

	@Query(value = "SELECT DISTINCT Category FROM Car", nativeQuery = true)
	List<String> viewCarCategory();
	
	@Query(value = "SELECT quantity FROM Car WHERE model_no = :modelNo ", nativeQuery = true)
	int getCarQuantity(@Param("modelNo")  String modelNo);
	
	@Query(value = "SELECT version FROM Car WHERE model_no = :modelNo ", nativeQuery = true)
	Long getVersion(@Param("modelNo")  String modelNo);
	
	@Modifying
	@Query(value = "UPDATE Car SET quantity = quantity - 1, version = version + 1 WHERE model_no = :modelNo AND version = :version ")
	void updateCarQuantity(@Param("modelNo")  String modelNo, @Param("version")  Long version);

}
