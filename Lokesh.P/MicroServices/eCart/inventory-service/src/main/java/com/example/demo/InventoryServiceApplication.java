package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.Model.Inventory;
import com.example.demo.repo.InventoryRepo;

@SpringBootApplication
public class InventoryServiceApplication {

	//@Bean
	public CommandLineRunner loadData(InventoryRepo inventoryRepo)
	{
		return args->{
			Inventory phone=Inventory.builder().build();
			phone.setProductName("iphone");
			phone.setProductQuantity(10);
			inventoryRepo.save(phone);
			Inventory laptop=Inventory.builder().build();
			laptop.setProductName("laptop");
			laptop.setProductQuantity(10);
			inventoryRepo.save(laptop);
		
			
		};
	}
	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

}
