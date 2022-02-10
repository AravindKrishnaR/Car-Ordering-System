package com.training.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.model.Orders;
import com.training.springboot.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/dealers/orders")
	private void placeOrder(@RequestBody Orders order) {
		orderService.placeOrder(order);
	}
	
	@GetMapping("/users/orders/{username}")
	private List<Orders> viewCustomerOrders(@PathVariable String username) {
		return orderService.viewUserOrders(username);
	}
	
	@GetMapping("/dealers/orders/{username}")
	private List<Orders> viewRestaurantOrders(@PathVariable String username) {
		return orderService.viewDealerOrders(username);
	}
}
