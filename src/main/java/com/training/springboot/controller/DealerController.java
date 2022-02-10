package com.training.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.model.Dealer;
import com.training.springboot.service.DealerService;

@RestController
public class DealerController {

	@Autowired
	DealerService dealerService;
	
	@PostMapping("/login/dealer")
	private Dealer getDealer(@RequestBody Map<String, String> json) {
		String username = json.get("username");
		String password = json.get("password");

		Dealer dealer = dealerService.viewDealerById(username);

		if(dealer.getPassword().equals(password)) {
			System.out.println("Login successful!");
			return dealer;
		}

		else {
			System.out.println("Login failed!");
			return null;
		}
	}

	@GetMapping("/dealers")
	private List<Dealer> viewDealers() {
		return dealerService.viewDealers();
	}

	@GetMapping("/dealer/{username}")
	private Dealer viewDealerById(@PathVariable("username") String username) {
		return dealerService.viewDealerById(username);
	}

	@PostMapping("/dealers")
	private String addDealer(@RequestBody Dealer dealer) {
		dealerService.addOrUpdateDealer(dealer);
		return "Dealer added successfully!";
	}

	@PutMapping("/dealers")
	private String updateDealer(@RequestBody Dealer dealer) {
		dealerService.addOrUpdateDealer(dealer);
		return "Dealer updated successfully!";
	}

	@DeleteMapping("/dealers/{username}")
	private String deleteDealer(@PathVariable("username") String username) {
		if (dealerService.deleteDealer(username))
			return ("Dealer deleted successfully!");
		else
			return ("Dealer deletion failed");
	}
}
