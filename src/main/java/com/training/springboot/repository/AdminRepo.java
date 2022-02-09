package com.training.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.training.springboot.model.Admin;

public interface AdminRepo extends CrudRepository <Admin, String> {

}
