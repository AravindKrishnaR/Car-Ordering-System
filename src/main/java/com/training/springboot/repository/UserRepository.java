package com.training.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.training.springboot.model.User;

public interface UserRepository extends CrudRepository <User, String>{

}
