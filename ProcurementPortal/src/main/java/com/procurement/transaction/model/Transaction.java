package com.procurement.transaction.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Transaction {
	@Id
	private String transactionId;
	private String buyerId;
	private String buyerCompany;
	private String[] productId;
	private String date;
	private int rent;
	private int period;
	private String sellerId;
	private String sellerCompany;
	private String location;
	private String productCount;
	private String inventoryType;
	private String inventoryId;
	public Transaction(String buyerId, String buyerCompany, String[] productId, String date, int rent, int period,
			String sellerId, String sellerCompany, String location, String productCount, String inventoryType,
			String inventoryId) {
		super();
		this.buyerId = buyerId;
		this.buyerCompany = buyerCompany;
		this.productId = productId;
		this.date = date;
		this.rent = rent;
		this.period = period;
		this.sellerId = sellerId;
		this.sellerCompany = sellerCompany;
		this.location = location;
		this.productCount = productCount;
		this.inventoryType = inventoryType;
		this.inventoryId = inventoryId;
	}
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getBuyerCompany() {
		return buyerCompany;
	}
	public void setBuyerCompany(String buyerCompany) {
		this.buyerCompany = buyerCompany;
	}
	public String[] getProductId() {
		return productId;
	}
	public void setProductId(String[] productId) {
		this.productId = productId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerCompany() {
		return sellerCompany;
	}
	public void setSellerCompany(String sellerCompany) {
		this.sellerCompany = sellerCompany;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getProductCount() {
		return productCount;
	}
	public void setProductCount(String productCount) {
		this.productCount = productCount;
	}
	public String getInventoryType() {
		return inventoryType;
	}
	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}
	public String getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(String inventoryId) {
		this.inventoryId = inventoryId;
	}
	
}
