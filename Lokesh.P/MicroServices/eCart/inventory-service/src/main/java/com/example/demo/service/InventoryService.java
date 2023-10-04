package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Inventory;
import com.example.demo.dto.RequestInventory;
import com.example.demo.repo.InventoryRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventoryService {
	
	private final InventoryRepo repo;
	public List<RequestInventory> isInStock(List<String> pname)
	{
		List<Inventory> iList=repo.findByProductNameIn(pname);
		List<RequestInventory> rList=iList.stream().map(product->mapToRequestInventory(product)).toList();	
		return rList;
		
	}
	public RequestInventory mapToRequestInventory(Inventory inv)
	{
		return RequestInventory.builder().productName(inv.getProductName()).productQuantity(inv.getProductQuantity()>0).build();
		
	}
	

}
