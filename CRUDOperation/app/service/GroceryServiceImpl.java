package com.xworkz.CRUDOperation.app.service;

import com.xworkz.CRUDOperation.app.repository.GroceryRepository;

public class GroceryServiceImpl implements GroceryService {
	private GroceryRepository groceryRepository;

	public GroceryServiceImpl(GroceryRepository groceryRepository) {
		this.groceryRepository = groceryRepository;
	}

	@Override
	public boolean validate(String grocery) {

		System.out.println("invoking validate from " + this.getClass().getSimpleName());
		if (grocery != null && !grocery.isEmpty() && grocery.length() >= 3 && grocery.length() <= 20) {
			System.out.println("Grocery data is valid");
			this.groceryRepository.save(grocery);;
		} else {
			System.out.println("Grocery data invalid");
		}

		return false;
	}

}
