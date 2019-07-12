package com.procurement.bidding.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.procurement.bidding.model.Bidding;
import com.procurement.bidding.repository.BiddingRepository;

@Service
public class BiddingService {
	@Autowired
	private BiddingRepository biddingRepository;
	
	//CREATE OPERATIONS
	
	public Bidding create(String buyerId, String buyerCompany, String inventoryType, int inventoryCount, int period, int rent,
			String location, String dateCreated) {
		return biddingRepository.save(new Bidding(buyerId, buyerCompany,inventoryType, inventoryCount, period, rent,location, dateCreated));
	}
	
	//RETRIEVE OPERATIONS
	
	public List<Bidding> getAll(){
		return biddingRepository.findAll();
	}
	public Bidding getByBiddingId(String biddingId) {
		return biddingRepository.findByBiddingId(biddingId);
	}
	public List<Bidding> getByBuyerId(String buyerId) {
		return biddingRepository.findByBuyerId(buyerId);
	}
	public List<Bidding> getByBuyerCompany(String buyerCompany) {
		return biddingRepository.findByBuyerCompany(buyerCompany);
	}
	public List<Bidding> getBySellerId(String sellerId) {
		return biddingRepository.findBySellerId(sellerId);
	}
	public List<Bidding> getBySellerCompany(String sellerCompany) {
		return biddingRepository.findBySellerCompany(sellerCompany);
	}
	public List<Bidding> getByInventoryType(String inventoryType) {
		return biddingRepository.findByInventoryType(inventoryType);
	}
	
	//UPDATE OPERATIONS
	
	public Bidding update(String biddingId, String sellerId, String sellerCompany, String dateAccepted) {
		Bidding b = biddingRepository.findByBiddingId(biddingId);
		b.setSellerId(sellerId);
		b.setSellerCompany(sellerCompany);
		b.setBidComplete(true);
		b.setDateAccepted(dateAccepted);
		return biddingRepository.save(b);
	}
	
	//DELETE OPERATIONS
	
	public void deleteAll() {
		biddingRepository.deleteAll();
	}
	public void delete(String emailId) {
		Bidding b = biddingRepository.findByBiddingId(emailId);
		biddingRepository.delete(b);
	}
}
