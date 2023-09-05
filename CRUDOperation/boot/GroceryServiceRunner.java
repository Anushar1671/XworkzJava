package com.xworkz.CRUDOperation.boot;

import com.xworkz.CRUDOperation.app.repository.GroceryRepository;
import com.xworkz.CRUDOperation.app.repository.GroceryRepositoryImpl;
import com.xworkz.CRUDOperation.app.service.GroceryService;
import com.xworkz.CRUDOperation.app.service.GroceryServiceImpl;

public class GroceryServiceRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in GroceryServiceRunner");
		GroceryRepository groceryRepository = new GroceryRepositoryImpl();
		GroceryService groceryService = new GroceryServiceImpl(groceryRepository);
		groceryService.validate("Rice");
		groceryService.validate("sugar");

	}
}
