package com.procurement.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.procurement.inventory.model.Inventory;
import com.procurement.inventory.service.InventoryService;


@RestController
@RequestMapping("/inventory")
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;
	
	//CREATE OPERATIONS REQUEST MAPPING
	
	@RequestMapping("/create")
	public Inventory create(@RequestParam String sellerId,@RequestParam  String companyName, 
			@RequestParam String inventoryDescription, @RequestParam String inventoryType,@RequestParam int rent, 
			@RequestParam String rentType,@RequestParam int inventoryCount, @RequestParam int remainingInventoryCount) {
		Inventory i = inventoryService.create(sellerId, companyName, inventoryDescription,  
				inventoryType, rent,  rentType, inventoryCount,  remainingInventoryCount);
		return i;
	}
	
	// RETRIEVE OPERATIONS REQUEST MAPPING
	
	@RequestMapping("/getAll")
	public List<Inventory> getAll(){
		return inventoryService.getAll();
	}
	@RequestMapping("/getByCompanyName")
	public List<Inventory> getByCompanyName(@RequestParam String companyName) {
		return inventoryService.getByCompanyName(companyName);
	}
	@RequestMapping("/getBySellerId")
	public List<Inventory> getBySellerId(@RequestParam String sellerId) {
		return inventoryService.getBySellerId(sellerId);
	}
	@RequestMapping("/getByInventoryId")
	public Inventory getByInventoryId(@RequestParam String inventoryId) {
		return inventoryService.getByInventoryId(inventoryId);
	}
	@RequestMapping("/getByInventoryType")
	public Inventory getByInventoryType(@RequestParam String inventoryType) {
		return inventoryService.getByInventoryId(inventoryType);
	}
	//UPDATE OPERATIONS REQUEST MAPPING
	
	@RequestMapping("/updateInventoryCount")
	public String update(@RequestParam String inventoryId, @RequestParam int inventoryCount) {
		Inventory s = inventoryService.updateInventoryCount(inventoryId, inventoryCount);
		return s.toString();
	}
	//DELETE OPERATIONS REQUEST MAPPING
	@RequestMapping("/delete")
	public String delete(@RequestParam String inventoryId) {
		inventoryService.delete(inventoryId);
		return "Deleted "+inventoryId;
	}
	@RequestMapping ("/deleteAll")
	public String deleteAll() {
		inventoryService.deleteAll();
		return "Deleted all records";
	}
}
