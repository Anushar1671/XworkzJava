package com.xworkz.CRUDOperation.app.repository;

public class PilotRepositoryImpl implements PilotRepository {
	private String[] names = new String[NO_OF_ITEMS];
	int position;

	@Override
	public void navigation(String name) {
		System.out.println("Invoking save in PilotRepositoryImpl");
		if (position < NO_OF_ITEMS) {
			this.names[position] = name;
			System.out.println("Pilot " + name + " is at " + this.position);
			this.position++;

		} else {
			System.err.println("Index is full");
		}

	}

}
