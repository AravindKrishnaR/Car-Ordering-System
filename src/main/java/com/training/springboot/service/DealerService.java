package com.training.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springboot.model.Dealer;
import com.training.springboot.repository.DealerRepo;

@Service
public class DealerService {
	
	@Autowired
	DealerRepo dealerRepo;
	
	public Dealer getDealer(String username) {
		return dealerRepo.findById(username).get();
	}
	
	public List<Dealer> viewDealers() {
		List<Dealer> dealerList = new ArrayList<Dealer>();
		dealerRepo.findAll().forEach(dealer -> dealerList.add(dealer));
		
		return dealerList;
	}
	
	public Dealer viewDealerById(String username) {
		return dealerRepo.findById(username).get();
	}
	
	public void addOrUpdateDealer(Dealer dealer) {
		dealerRepo.save(dealer);
	}
	
	public void deleteDealer(String username) {
		dealerRepo.deleteById(username);
	}

}
