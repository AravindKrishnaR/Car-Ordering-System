package com.training.springboot.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.model.Admin;
import com.training.springboot.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/login/admin")
	
	private Admin getAdmin(@RequestBody Map<String, String> json) {
		String username = json.get("username");
		String password = json.get("password");
		
		Admin admin = adminService.viewAdminById(username);
		
		if(admin.getPassword().equals(password)) {
			System.out.println("Login successful!");
			return admin;
		}
		else {
			System.out.println("Login failed!");
			return null;
		}
	}

}
