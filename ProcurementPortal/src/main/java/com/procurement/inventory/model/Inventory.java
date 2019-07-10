package com.procurement.inventory.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Inventory {
	@Id
	private String InventoryId;
	private String sellerId;
	private String companyName;
	private String inventoryDescription;
	private String inventoryType;
	private int rent;
	private String rentType;
	private int inventoryCount;
	private int remainingInventoryCount;
	private String[] machineId;
	private String[] remainingMachineId;
	
	public Inventory(String sellerId, String companyName, String inventoryDescription, 
			String inventoryType, int rent, String rentType,
			int inventoryCount, int remainingInventoryCount) {
		super();
		String[] machineId = new String[inventoryCount];
		String[] remainingMachineId = new String[inventoryCount];
		this.sellerId = sellerId;
		this.companyName = companyName;
		this.inventoryDescription = inventoryDescription;
		this.inventoryType = inventoryType;
		this.rent = rent;
		this.rentType = rentType;
		this.inventoryCount = inventoryCount;
		this.remainingInventoryCount = remainingInventoryCount;
		for(int i=0; i<inventoryCount; i++) {
			machineId[i] = sellerId + "_" + this.getInventoryId() + "_" + i;
		}
		this.machineId = machineId;
		this.remainingMachineId = remainingMachineId;
	}
	
	public String getInventoryId() {
		return InventoryId;
	}
	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getInventoryDescription() {
		return inventoryDescription;
	}

	public void setInventoryDescription(String inventoryDescription) {
		this.inventoryDescription = inventoryDescription;
	}

	public String getInventoryType() {
		return inventoryType;
	}

	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public String getRentType() {
		return rentType;
	}

	public void setRentType(String rentType) {
		this.rentType = rentType;
	}

	public int getInventoryCount() {
		return inventoryCount;
	}

	public void setInventoryCount(int inventoryCount) {
		this.inventoryCount = inventoryCount;
	}

	public int getRemainingInventoryCount() {
		return remainingInventoryCount;
	}

	public void setRemainingInventoryCount(int remainingInventoryCount) {
		this.remainingInventoryCount = remainingInventoryCount;
	}

	public String[] getMachineId() {
		return machineId;
	}

	public void setMachineId(String[] machineId) {
		this.machineId = machineId;
	}

	public String[] getRemainingMachineId() {
		return remainingMachineId;
	}

	public void setRemainingMachineId(String[] remainingMachineId) {
		this.remainingMachineId = remainingMachineId;
	}
}
