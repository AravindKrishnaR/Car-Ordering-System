package com.training.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.model.User;
import com.training.springboot.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	PasswordEncoder pass;
	
	public UserController() {
		this.pass = new BCryptPasswordEncoder();
	}
	
	@PostMapping("/login/user")
	private User getDealer(@RequestBody Map<String, String> json) {
		String username = json.get("username");
		String password = json.get("password");
		
		User user = userService.viewUserById(username);
		
		
		if(pass.matches(password, user.getPassword())) {
			System.out.println("Login successful!");
			return user;
		}
		
		else {
			System.out.println("Login failed!");
			return null;
		}
	}
	
	@GetMapping("/users")
	private List<User> viewUsers() {
		return userService.viewUsers();
	}
	
	@GetMapping("/user/{username}")
	private User viewUserById(@PathVariable("username") String username) {
		return userService.viewUserById(username);
	}
	
	@PostMapping("/users")
	@ResponseBody
	private String addUser(User user) {
		userService.addOrUpdateUser(user);
		return "User added successfully!";
	}
	
	@PutMapping("/users")
	@ResponseBody
	private String updateUser(User user) {
		userService.addOrUpdateUser(user);
		return "User updated successfully!";
	}
	
	@DeleteMapping("/users/{username}")
	private String deleteUser(@PathVariable("username") String username) {
		if (userService.deleteUser(username))
			return ("User deleted successfully!");
		else
			return ("User deletion failed");
	}
}
