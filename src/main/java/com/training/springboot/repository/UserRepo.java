package com.training.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.training.springboot.model.User;

public interface UserRepo extends CrudRepository <User, String>{

}
