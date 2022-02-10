package com.training.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springboot.model.Admin;
import com.training.springboot.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	AdminRepository adminRepository;

	public Admin viewAdminById(String username) {
		return adminRepository.findById(username).get();
	}
}
