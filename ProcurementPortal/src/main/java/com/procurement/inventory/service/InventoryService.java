package com.procurement.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.procurement.inventory.model.Inventory;
import com.procurement.inventory.repository.InventoryRepository;

@Service
public class InventoryService {
	
	@Autowired
	private InventoryRepository inventoryRepository;
	
	//CREATE OPERATIONS
	
	public Inventory create(String sellerId, String companyName, 
			String inventoryDescription, String inventoryType, int rent, 
			String rentType,int inventoryCount, int remainingInventoryCount) {
		return inventoryRepository.save(new Inventory(sellerId, companyName, inventoryDescription,  
				inventoryType, rent,  rentType, inventoryCount,  remainingInventoryCount));
	}
	
	//RETRIEVE OPERATIONS
	
	public List<Inventory> getAll(){
		return inventoryRepository.findAll();
	}
	public List<Inventory> getByCompanyName(String companyName) {
		return inventoryRepository.findByCompanyName(companyName);
	}
	public List<Inventory> getBySellerId(String sellerId) {
		return inventoryRepository.findBySellerId(sellerId);
	}
	public List<Inventory> getByInventoryType(String inventoryType) {
		return inventoryRepository.findByInventoryType(inventoryType);
	}
	public Inventory getByInventoryId(String inventoryId) {
		return inventoryRepository.findByInventoryId(inventoryId);
	}
	
	//UPDATE OPERATIONS
	
	public Inventory updateInventoryCount(String inventoryId, int inventoryCount) {
		Inventory i = inventoryRepository.findByInventoryId(inventoryId);
		i.setInventoryCount(inventoryCount);
		return inventoryRepository.save(i);
	}
	
	//DELETE OPERATIONS
	
	public void deleteAll() {
		inventoryRepository.deleteAll();
	}
	public void delete(String inventoryId) {
		Inventory i = inventoryRepository.findByInventoryId(inventoryId);
		inventoryRepository.delete(i);
	}
}
