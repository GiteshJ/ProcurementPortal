package com.procurement.buyer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.procurement.buyer.model.Buyer;

@Repository
public interface BuyerRepository extends MongoRepository<Buyer, String>{
	public Buyer findByEmailId(String emailId);
	public Buyer findBySellerId(String sellerId);
	public Buyer findByCompanyName(String companyName);
	public Buyer findByRegistrationNumber(String registrationNumber);
	public Buyer findByGstNumber(String gstNumber);
}
