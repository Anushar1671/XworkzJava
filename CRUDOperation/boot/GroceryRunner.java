package com.xworkz.CRUDOperation.boot;

import com.xworkz.CRUDOperation.app.repository.GroceryRepository;
import com.xworkz.CRUDOperation.app.repository.GroceryRepositoryImpl;

public class GroceryRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in GroceryRunner");
		GroceryRepository groceryRepository = new GroceryRepositoryImpl();
		groceryRepository.save("Rice");
		groceryRepository.save("Sugar");
		groceryRepository.save("Salt");
		groceryRepository.save("Shampoo");
		groceryRepository.save("Soap");
		groceryRepository.save("Almond");
		groceryRepository.save("Oil");
		groceryRepository.save("Onion");
		groceryRepository.save("Tomato");
		groceryRepository.save("Potato");
		groceryRepository.save("Chilli");

	}

}
