package com.training.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springboot.model.Orders;
import com.training.springboot.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	public void placeOrder(Orders order) {
		orderRepository.save(order);
	}

	public List<Orders> viewUserOrders(String username) {
		List<Orders> orderList = new ArrayList<Orders>();
		orderRepository.viewUserOrders(username).forEach(order -> orderList.add(order));

		return orderList;
	}

	public List<Orders> viewDealerOrders(String username) {
		List<Orders> orderList = new ArrayList<Orders>();
		orderRepository.viewDealerOrders(username).forEach(order -> orderList.add(order));

		return orderList;
	}

}
