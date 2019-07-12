package com.procurement.bidding.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Bidding {
	@Id
	private String biddingId;
	private String buyerId;
	private String buyerCompany;
	private String inventoryType;
	private int inventoryCount;
	private int period;
	private int rent;
	private String location;
	private String dateCreated;
	private boolean bidComplete;
	private String sellerId;
	private String sellerCompany;
	private String dateAccepted;
	private boolean expired;
	public Bidding(String buyerId, String buyerCompany, String inventoryType, int inventoryCount, int period, int rent,
			String location, String dateCreated) {
		super();
		this.buyerId = buyerId;
		this.buyerCompany = buyerCompany;
		this.inventoryType = inventoryType;
		this.inventoryCount = inventoryCount;
		this.period = period;
		this.rent = rent;
		this.location = location;
		this.dateCreated = dateCreated;
		this.bidComplete = false;
		this.expired = false;
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
	public String getInventoryType() {
		return inventoryType;
	}
	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}
	public int getInventoryCount() {
		return inventoryCount;
	}
	public void setInventoryCount(int inventoryCount) {
		this.inventoryCount = inventoryCount;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public boolean isBidComplete() {
		return bidComplete;
	}
	public void setBidComplete(boolean bidComplete) {
		this.bidComplete = bidComplete;
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
	public String getDateAccepted() {
		return dateAccepted;
	}
	public void setDateAccepted(String dateAccepted) {
		this.dateAccepted = dateAccepted;
	}
	public boolean isExpired() {
		return expired;
	}
	public void setExpired(boolean expired) {
		this.expired = expired;
	}
	
	
}
