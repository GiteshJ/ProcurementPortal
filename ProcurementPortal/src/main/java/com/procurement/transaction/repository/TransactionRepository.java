package com.procurement.transaction.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.procurement.transaction.model.Transaction;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction, String>{
	public Transaction findByTransactionId(String transactionId);
	public List<Transaction> findByBuyerId(String buyerId);
	public List<Transaction> findByBuyerCompany(String buyerCompany);
	public List<Transaction> findBySellerId(String sellerId);
	public List<Transaction> findBySellerCompany(String sellerCompany);
	public List<Transaction> findByInventoryId(String inventoryId);
	public List<Transaction> findByInventoryType(String inventoryType);
	
}
