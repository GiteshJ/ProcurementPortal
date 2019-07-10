package com.procurement.transaction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.procurement.transaction.model.Transaction;
import com.procurement.transaction.repository.TransactionRepository;

@Service
public class TransactionService {
	@Autowired
	private TransactionRepository transactionRepository;
	
	//CREATE OPERATIONS
	
	public Transaction create(String buyerId, String buyerCompany, String[] productId, String date, int rent, int period,
			String sellerId, String sellerCompany, String location, String productCount, String inventoryType,
			String inventoryId) {
		return transactionRepository.save(new Transaction(buyerId, buyerCompany, productId, date, rent, period,
				sellerId, sellerCompany, location, productCount, inventoryType,inventoryId));
	}
	
	//RETRIEVE OPERATIONS
	
	public List<Transaction> getAll(){
		return transactionRepository.findAll();
	}
	public List<Transaction> getByBuyerId(String buyerId) {
		return transactionRepository.findByBuyerId(buyerId);
	}
	public List<Transaction> getByBuyerCompany(String buyerCompany) {
		return transactionRepository.findByBuyerCompany(buyerCompany);
	}
	public List<Transaction> getBySellerId(String sellerId) {
		return transactionRepository.findBySellerId(sellerId);
	}
	public List<Transaction> getByInventoryType(String inventoryType) {
		return transactionRepository.findBySellerCompany(inventoryType);
	}
	public List<Transaction> getByInventoryId(String inventoryId) {
		return transactionRepository.findByInventoryId(inventoryId);
	}
	
	//UPDATE OPERATIONS
	
	public Transaction update(String transactionId, int rent) {
		Transaction t = transactionRepository.findByTransactionId(transactionId);
		t.setRent(rent);
		return transactionRepository.save(t);
	}
	
	//DELETE OPERATIONS
	
	public void deleteAll() {
		transactionRepository.deleteAll();
	}
	public void delete(String transactionId) {
		Transaction t = transactionRepository.findByTransactionId(transactionId);
		transactionRepository.delete(t);
	}
}
