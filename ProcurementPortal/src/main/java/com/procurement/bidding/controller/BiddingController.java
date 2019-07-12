package com.procurement.bidding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.procurement.bidding.model.Bidding;
import com.procurement.bidding.service.BiddingService;

@RestController
@RequestMapping("/bidding")
public class BiddingController {
	@Autowired
	private BiddingService biddingService;
	
	//CREATE OPERATIONS REQUEST MAPPING
	
	@RequestMapping("/create")
	public String create(@RequestParam String buyerId, @RequestParam String buyerCompany, @RequestParam String inventoryType, @RequestParam int inventoryCount, @RequestParam int period, @RequestParam int rent,
			@RequestParam String location, @RequestParam String dateCreated) {
		Bidding b = biddingService.create(buyerId, buyerCompany,inventoryType, inventoryCount, period, rent,location, dateCreated);
		return b.toString();
	}
	
	// RETRIEVE OPERATIONS REQUEST MAPPING
	
	@RequestMapping("/getAll")
	public List<Bidding> getAll(){
		return biddingService.getAll();
	}
	@RequestMapping("/getByBiddingId")
	public Bidding getByBiddingId(@RequestParam String biddingId) {
		return biddingService.getByBiddingId(biddingId);
	}
	@RequestMapping("/getBySellerCompany")
	public List<Bidding> getBySellerCompany(@RequestParam String sellerCompany) {
		return biddingService.getBySellerCompany(sellerCompany);
	}
	@RequestMapping("/getBySellerId")
	public List<Bidding> getBySellerId(@RequestParam String sellerId) {
		return biddingService.getBySellerId(sellerId);
	}
	@RequestMapping("/getByBuyerCompany")
	public List<Bidding> getByBuyerCompany(@RequestParam String buyerCompany) {
		return biddingService.getByBuyerCompany(buyerCompany);
	}
	@RequestMapping("/getByBuyerId")
	public List<Bidding> getByBuyerId(@RequestParam String buyerId) {
		return biddingService.getByBuyerId(buyerId);
	}
	
	//UPDATE OPERATIONS REQUEST MAPPING
	
	@RequestMapping("/update")
	public String update(@RequestParam String biddingId, @RequestParam String sellerId, @RequestParam String sellerCompany, @RequestParam String dateAccepted) {
		Bidding b = biddingService.update(biddingId,sellerId,sellerCompany,dateAccepted);
		return b.toString();
	}
	//DELETE OPERATIONS REQUEST MAPPING
	@RequestMapping("/delete")
	public String delete(@RequestParam String biddingId) {
		biddingService.delete(biddingId);
		return "Deleted "+biddingId;
	}
	@RequestMapping("/deleteAll")
	public String deleteAll() {
		biddingService.deleteAll();
		return "Deleted all records";
	}
}
