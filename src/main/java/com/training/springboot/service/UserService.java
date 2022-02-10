package com.training.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.training.springboot.model.User;
import com.training.springboot.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User viewUserById(String username) {
		return userRepository.findById(username).get();
	}
	
	public List<User> viewUsers() {
		List<User> userList = new ArrayList<User>();
		userRepository.findAll().forEach(user -> userList.add(user));
		
		return userList;
	}
	
	PasswordEncoder password;
	
	public UserService() {
		this.password = new BCryptPasswordEncoder();
	}
	
	public void addOrUpdateUser(User user) {
		String password = this.password.encode(user.getPassword());
		user.setPassword(password);
		userRepository.save(user);
	}
	
	public boolean deleteUser(String username) {
		if (userRepository.findById(username).isPresent()) {
			userRepository.deleteById(username);
			return true;
		} 
		else
			return false;
	}

}
