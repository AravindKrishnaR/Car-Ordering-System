package com.training.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springboot.model.Dealer;
import com.training.springboot.repository.DealerRepository;

@Service
public class DealerService {
	
	@Autowired
	DealerRepository dealerRepository;
	
	public Dealer viewDealerById(String username) {
		return dealerRepository.findById(username).get();
	}
	
	public List<Dealer> viewDealers() {
		List<Dealer> dealerList = new ArrayList<Dealer>();
		dealerRepository.findAll().forEach(dealer -> dealerList.add(dealer));
		
		return dealerList;
	}
	
	public void addOrUpdateDealer(Dealer dealer) {
		dealerRepository.save(dealer);
	}
	
	public boolean deleteDealer(String username) {
		if (dealerRepository.findById(username).isPresent()) {
			dealerRepository.deleteById(username);
			return true;
		} 
		else
			return false;
	}

}
