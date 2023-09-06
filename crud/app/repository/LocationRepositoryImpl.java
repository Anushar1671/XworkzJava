package com.xworkz.crud.app.repository;

public class LocationRepositoryImpl implements LocationRepository {
	private String[] lnames = new String[TOTAL_ITEMS];
	int position;

	@Override
	public void storeLocation(String lname) {
		System.out.println("Invoking storeLocation in LocationRepositoryImpl");
		if (position < TOTAL_ITEMS) {
			this.lnames[position] = lname;
			System.out.println("Location name " + lname + " at position " + this.position);
			this.position++;
		} else {
			System.err.println("Index is full connot store more data");
		}

	}

	@Override
	public boolean isExist(String lname) {
		for (int index = 0; index < this.position; index++) {
			String temp = this.lnames[index];
			if (temp != null && temp.equals(lname)) {
				System.out.println("Location already exist..");
				return true;
			}
		}
		return LocationRepository.super.isExist(lname);
	}

}
