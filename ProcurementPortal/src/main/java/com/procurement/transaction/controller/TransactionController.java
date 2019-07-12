package com.procurement.transaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.procurement.transaction.model.Transaction;
import com.procurement.transaction.service.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	@Autowired
	private TransactionService transactionService;
	
	//CREATE OPERATIONS REQUEST MAPPING
	
	@RequestMapping("/create")
	public String create(@RequestParam String buyerId, @RequestParam String buyerCompany, @RequestParam String[] productId, @RequestParam String date, @RequestParam int rent, @RequestParam int period,
			@RequestParam String sellerId, @RequestParam String sellerCompany, @RequestParam String location, @RequestParam String productCount, @RequestParam String inventoryType,
			@RequestParam String inventoryId) {
		Transaction t = transactionService.create(buyerId,buyerCompany,productId,date,rent,period,
				sellerId,sellerCompany,location,productCount,inventoryType,inventoryId);
		return t.toString();
	}
	
	// RETRIEVE OPERATIONS REQUEST MAPPING
	
	@RequestMapping("/getAll")
	public List<Transaction> getAll(){
		return transactionService.getAll();
	}
	@RequestMapping("/getByBuyerId")
	public List<Transaction> getByBuyerId(@RequestParam String buyerId) {
		return transactionService.getByBuyerId(buyerId);
	}
	@RequestMapping("/getByBuyerCompany")
	public List<Transaction> getByBuyerCompany(@RequestParam String buyerCompany) {
		return transactionService.getByBuyerCompany(buyerCompany);
	}
	@RequestMapping("/getBySellerId")
	public List<Transaction> getBySellerId(@RequestParam String sellerId) {
		return transactionService.getBySellerId(sellerId);
	}
	@RequestMapping("/getBySellerCompany")
	public List<Transaction> getBySellerCompany(@RequestParam String sellerCompany) {
		return transactionService.getBySellerCompany(sellerCompany);
	}
	@RequestMapping("/getByInventoryId")
	public List<Transaction> getByInventoryId(@RequestParam String inventoryId) {
		return transactionService.getByInventoryId(inventoryId);
	}
	@RequestMapping("/getByInventoryType")
	public List<Transaction> getByInventoryType(@RequestParam String inventoryType) {
		return transactionService.getByInventoryType(inventoryType);
	}
	
	//UPDATE OPERATIONS REQUEST MAPPING
	
	@RequestMapping("/update")
	public String update(@RequestParam String transactionId,@RequestParam int rent) {
		Transaction t = transactionService.update(transactionId, rent);
		return t.toString();
	}
	//DELETE OPERATIONS REQUEST MAPPING
	@RequestMapping("/delete")
	public String delete(@RequestParam String transactionId) {
		transactionService.delete(transactionId);
		return "Deleted "+transactionId;
	}
	@RequestMapping("/deleteAll")
	public String deleteAll() {
		transactionService.deleteAll();
		return "Deleted all records";
	}
}
