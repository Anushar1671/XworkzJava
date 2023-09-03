package com.xworkz.CRUDOperation.app.repository;

public class PolitcianRepositoryImpl implements PolitcianRepository {
	private String[] party = new String[NO_OF_ITEMS];
	int position;

	@Override
	public void experience(String name) {
		System.out.println("Invoking save in PoliticianRepositoryImpl");
		if (position < NO_OF_ITEMS) {
			this.party[position] = name;
			System.out.println("Pilot " + name + " is at " + this.position);
			this.position++;

		} else {
			System.err.println("Index is full");
		}

	}

}
