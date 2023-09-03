package com.xworkz.CRUDOperation.app.repository;

public class JacketRepositoryImpl implements JacketRepsitory {
	private String[] brands = new String[TOTAL_ITEMS];
	int position;

	@Override
	public void color(String brand) {
		System.out.println("Invoking save in JacketRepositoryImpl");
		if (position < TOTAL_ITEMS) {
			this.brands[position] = brand;
			System.out.println("color " + brand + " in position " + this.position);
			this.position++;

		} else {
			System.err.println("Index is full");
		}

	}

}
