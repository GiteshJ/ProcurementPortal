package com.procurement.seller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.procurement.seller.model.Seller;
import com.procurement.seller.service.SellerService;

@RestController
@RequestMapping("/seller")
public class SellerController {

	@Autowired
	private SellerService sellerService;
	
	//CREATE OPERATIONS REQUEST MAPPING
	
	@RequestMapping("/create")
	public String create(@RequestParam String companyName, @RequestParam String registrationNumber, 
			@RequestParam String gstNumber, @RequestParam String supervisor, @RequestParam String contact,
			@RequestParam String address, @RequestParam String emailId, @RequestParam String password) {
		Seller s = sellerService.create(companyName, registrationNumber, 
				gstNumber, supervisor, contact, address, emailId, password);
		return s.toString();
	}
	
	// RETRIEVE OPERATIONS REQUEST MAPPING
	
	@RequestMapping("/getAll")
	public List<Seller> getAll(){
		return sellerService.getAll();
	}
	@RequestMapping("/getByEmailId")
	public Seller getByEmailId(@RequestParam String emailId) {
		return sellerService.getByEmailId(emailId);
	}
	@RequestMapping("/getByCompanyName")
	public Seller getByCompanyName(@RequestParam String companyName) {
		return sellerService.getByCompanyName(companyName);
	}
	@RequestMapping("/getBySellerId")
	public Seller getBySellerId(@RequestParam String sellerId) {
		return sellerService.getBySellerId(sellerId);
	}
	@RequestMapping("/getByRegistrationName")
	public Seller getByRegistrationName(@RequestParam String registrationNumber) {
		return sellerService.getByRegistrationName(registrationNumber);
	}
	@RequestMapping("/getByGstNumber")
	public Seller getByGstNumber(@RequestParam String gstNumber) {
		return sellerService.getByGstNumber(gstNumber);
	}
	
	//UPDATE OPERATIONS REQUEST MAPPING
	
	@RequestMapping("/updateContact")
	public String update(@RequestParam String emailId, @RequestParam String contact) {
		Seller s = sellerService.updateContact(emailId, contact);
		return s.toString();
	}
	//DELETE OPERATIONS REQUEST MAPPING
	@RequestMapping("/delete")
	public String delete(@RequestParam String emailId) {
		sellerService.delete(emailId);
		return "Deleted "+emailId;
	}
	@RequestMapping("/deleteAll")
	public String deleteAll() {
		sellerService.deleteAll();
		return "Deleted all records";
	}
	@RequestMapping("/login")
	public boolean login(@RequestParam String emailId, @RequestParam String password) {
		Seller b = sellerService.getByEmailId(emailId);
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
