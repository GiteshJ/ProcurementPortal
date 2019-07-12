package com.procurement.bidding.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.procurement.bidding.model.Bidding;

@Repository
public interface BiddingRepository extends MongoRepository<Bidding, String>{
	public Bidding findByBiddingId(String biddingId);
	public List<Bidding> findByBuyerId(String buyerId);
	public List<Bidding> findByBuyerCompany(String buyerCompany);
	public List<Bidding> findBySellerId(String sellerId);
	public List<Bidding> findBySellerCompany(String sellerCompany);
	public List<Bidding> findByInventoryType(String inventoryType);
}
