package com.training.springboot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springboot.model.Orders;
import com.training.springboot.repository.CarRepository;
import com.training.springboot.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	CarRepository carRepository;
	
	@Transactional
	public void placeOrder(Orders order) throws Exception {
		int quantity = carRepository.getCarQuantity(order.getModelNo());
		Long version  = carRepository.getVersion(order.getModelNo());
		
		if(quantity > 0) {
			carRepository.updateCarQuantity(order.getModelNo(), version);
			orderRepository.save(order);
		}
		else {
			throw new Exception("Car is not available");
			//System.out.println("Car is not available");
		}
			
	}

	public List<Orders> viewUserOrders(String username) {
		List<Orders> orderList = new ArrayList<Orders>();
//		orderRepository.viewUserOrders(username).forEach(order -> orderList.add(order));
		orderRepository.findByUsername(username).forEach(order -> orderList.add(order));

		return orderList;
	}

	public List<Orders> viewDealerOrders(String username) {
		List<Orders> orderList = new ArrayList<Orders>();
		orderRepository.viewDealerOrders(username).forEach(order -> orderList.add(order));

		return orderList;
	}

}
