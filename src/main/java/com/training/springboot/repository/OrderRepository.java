package com.training.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.training.springboot.model.Orders;

public interface OrderRepository extends CrudRepository<Orders, Integer> {

	@Query(value = "SELECT * from Orders WHERE username =:username ", nativeQuery = true)
	List<Orders> viewUserOrders(@Param("username") String username);

	@Query(value = "SELECT * from Orders " + "JOIN Car ON Orders.model_no = Car.model_no "
			+ "JOIN Dealer ON Car.dealer_username = Dealer.username "
			+ "WHERE Dealer.username =:username ", nativeQuery = true)
	List<Orders> viewDealerOrders(@Param("username") String username);

}
