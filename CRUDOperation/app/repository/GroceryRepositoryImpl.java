package com.xworkz.CRUDOperation.app.repository;

public class GroceryRepositoryImpl implements GroceryRepository {
	private String[] groceries = new String[TOTAL_ITEMS];
	int position;

	@Override
	public void save(String grocery) {
		System.out.println("Invoking save in GroceryRepositoryImpl");
		if (position < TOTAL_ITEMS) {
			this.groceries[position] = grocery;
			System.out.println("Store " + grocery + " in position " + this.position);
			this.position++;

		} else {
			System.err.println("Index is full");
		}
	}
}
