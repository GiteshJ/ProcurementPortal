package com.procurement.seller.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.procurement.seller.model.Seller;

@Repository
public interface SellerRepository extends MongoRepository<Seller, String>{
	public Seller findByEmailId(String emailId);
	public Seller findBySellerId(String sellerId);
	public Seller findByCompanyName(String companyName);
	public Seller findByRegistrationNumber(String registrationNumber);
	public Seller findByGstNumber(String gstNumber);
}
