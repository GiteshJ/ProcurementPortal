package com.procurement.inventory.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.procurement.inventory.model.Inventory;

@Repository
public interface InventoryRepository extends MongoRepository<Inventory, String>{
	public Inventory findByInventoryId(String inventoryId);
	public List<Inventory> findBySellerId(String sellerId);
	public List<Inventory> findByCompanyName(String companyName);
	public List<Inventory> findByInventoryType(String inventoryType);
}
