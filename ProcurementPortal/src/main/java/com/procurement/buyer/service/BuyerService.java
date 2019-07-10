package com.procurement.buyer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.procurement.buyer.repository.BuyerRepository;
import com.procurement.buyer.model.Buyer;

@Service
public class BuyerService {
	@Autowired
	private BuyerRepository buyerRepository;
	
	//CREATE OPERATIONS
	
	public Buyer create(String companyName, String registrationNumber, 
			String gstNumber, String supervisor, String contact,
			String address, String emailId, String password) {
		return buyerRepository.save(new Buyer(companyName, registrationNumber, 
				gstNumber, supervisor, contact, address, emailId, password));
	}
	
	//RETRIEVE OPERATIONS
	
	public List<Buyer> getAll(){
		return buyerRepository.findAll();
	}
	public Buyer getByEmailId(String emailId) {
		return buyerRepository.findByEmailId(emailId);
	}
	public Buyer getByCompanyName(String companyName) {
		return buyerRepository.findByCompanyName(companyName);
	}
	public Buyer getBySellerId(String sellerId) {
		return buyerRepository.findBySellerId(sellerId);
	}
	public Buyer getByRegistrationName(String registrationNumber) {
		return buyerRepository.findByRegistrationNumber(registrationNumber);
	}
	public Buyer getByGstNumber(String gstNumber) {
		return buyerRepository.findByGstNumber(gstNumber);
	}
	
	//UPDATE OPERATIONS
	
	public Buyer updateContact(String emailId, String contact) {
		Buyer b = buyerRepository.findByEmailId(emailId);
		b.setContact(contact);
		return buyerRepository.save(b);
	}
	
	//DELETE OPERATIONS
	
	public void deleteAll() {
		buyerRepository.deleteAll();
	}
	public void delete(String emailId) {
		Buyer b = buyerRepository.findByEmailId(emailId);
		buyerRepository.delete(b);
	}
}
