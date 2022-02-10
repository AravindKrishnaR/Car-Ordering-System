package com.training.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.training.springboot.model.Orders;

public interface OrdersController extends CrudRepository<Orders, Integer> {

}
