package com.procurement.buyer.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.procurement.buyer.model.Buyer;
import com.procurement.buyer.service.BuyerService;


@RestController
@RequestMapping("/buyer")
public class BuyerController {
	@Autowired
	private BuyerService buyerService;
	//CREATE OPERATIONS REQUEST MAPPING
	
	@RequestMapping(value = "/create")
	public String create(@RequestParam String companyName, @RequestParam String registrationNumber, 
			@RequestParam String gstNumber, @RequestParam String supervisor, @RequestParam String contact,
			@RequestParam String address, @RequestParam String emailId, @RequestParam String password) {
		String encodedPassword = password;
		Buyer s = buyerService.create(companyName, registrationNumber, 
				gstNumber, supervisor, contact, address, emailId, encodedPassword);
		return s.toString();
	}
	
	// RETRIEVE OPERATIONS REQUEST MAPPING
	
	@RequestMapping("/getAll")
	public List<Buyer> getAll(){
		return buyerService.getAll();
	}
	@RequestMapping("/getByEmailId")
	public Buyer getByEmailId(@RequestParam String emailId) {
		return buyerService.getByEmailId(emailId);
	}
	@RequestMapping("/getByCompanyName")
	public Buyer getByCompanyName(@RequestParam String companyName) {
		return buyerService.getByCompanyName(companyName);
	}
	@RequestMapping("/getBySellerId")
	public Buyer getBySellerId(@RequestParam String sellerId) {
		return buyerService.getBySellerId(sellerId);
	}
	@RequestMapping("/getByRegistrationName")
	public Buyer getByRegistrationName(@RequestParam String registrationNumber) {
		return buyerService.getByRegistrationName(registrationNumber);
	}
	@RequestMapping("/getByGstNumber")
	public Buyer getByGstNumber(@RequestParam String gstNumber) {
		return buyerService.getByGstNumber(gstNumber);
	}
	
	//UPDATE OPERATIONS REQUEST MAPPING
	
	@RequestMapping("/updateContact")
	public String update(@RequestParam String emailId, @RequestParam String contact) {
		Buyer b = buyerService.updateContact(emailId, contact);
		return b.toString();
	}
	//DELETE OPERATIONS REQUEST MAPPING
	@RequestMapping("/delete")
	public String delete(@RequestParam String emailId) {
		buyerService.delete(emailId);
		return "Deleted "+emailId;
	}
	@RequestMapping ("/deleteAll")
	public String deleteAll() {
		buyerService.deleteAll();
		return "Deleted all records";
	}
	
	@RequestMapping("/login")
	public boolean login(@RequestParam String emailId, @RequestParam String password) {
		Buyer b = buyerService.getByEmailId(emailId);
		if(b.getPassword().equals(password)) {
			System.out.println(emailId);
			return true;
		}
		else {
			System.out.println("Wrong");
			return false;
		}
	}
}
