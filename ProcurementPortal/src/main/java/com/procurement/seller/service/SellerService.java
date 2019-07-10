package com.procurement.seller.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.procurement.seller.model.Seller;
import com.procurement.seller.repository.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepository;
	
	//CREATE OPERATIONS
	
	public Seller create(String companyName, String registrationNumber, 
			String gstNumber, String supervisor, String contact,
			String address, String emailId, String password) {
		return sellerRepository.save(new Seller(companyName, registrationNumber, 
				gstNumber, supervisor, contact, address, emailId, password));
	}
	
	//RETRIEVE OPERATIONS
	
	public List<Seller> getAll(){
		return sellerRepository.findAll();
	}
	public Seller getByEmailId(String emailId) {
		return sellerRepository.findByEmailId(emailId);
	}
	public Seller getByCompanyName(String companyName) {
		return sellerRepository.findByCompanyName(companyName);
	}
	public Seller getBySellerId(String sellerId) {
		return sellerRepository.findBySellerId(sellerId);
	}
	public Seller getByRegistrationName(String registrationNumber) {
		return sellerRepository.findByRegistrationNumber(registrationNumber);
	}
	public Seller getByGstNumber(String gstNumber) {
		return sellerRepository.findByGstNumber(gstNumber);
	}
	
	//UPDATE OPERATIONS
	
	public Seller updateContact(String emailId, String contact) {
		Seller s = sellerRepository.findByEmailId(emailId);
		s.setContact(contact);
		return sellerRepository.save(s);
	}
	
	//DELETE OPERATIONS
	
	public void deleteAll() {
		sellerRepository.deleteAll();
	}
	public void delete(String emailId) {
		Seller s = sellerRepository.findByEmailId(emailId);
		sellerRepository.delete(s);
	}
	
}
