package com.xworkz.CRUDOperation.app.repository;

public class HistoricalPlaceRepositoryImpl implements HistoricalPlaceRepository {
	private String[] places = new String[NO_OF_PLACES];
	int position;

	@Override
	public void place(String name) {
		System.out.println("Invoking save in HistoricalPlaceRepositoryImpl");
		if (position < NO_OF_PLACES) {
			this.places[position] = name;
			System.out.println("Place " + name + " is at " + this.position);
			this.position++;

		} else {
			System.err.println("Index is full");
		}
	}

}
