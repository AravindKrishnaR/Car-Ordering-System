package com.training.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.training.springboot.model.Dealer;

public interface DealerRepo extends CrudRepository<Dealer, String> {

}
