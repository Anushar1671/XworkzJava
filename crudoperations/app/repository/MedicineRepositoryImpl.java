package com.xworkz.CRUDOperation.app.repository;

public class MedicineRepositoryImpl implements MedicineRepository {
	private String[] medicines = new String[TOTAL_ITEMS];
	int position;

	@Override
	public void name(String madicineName) {
		System.out.println("Invoking name in MedicineRepositoryImpl");
		if (position < TOTAL_ITEMS) {
			this.medicines[position] = madicineName;
			System.out.println("Medicine " + madicineName + " in position " + this.position);
			this.position++;

		} else {
			System.err.println("Index is full");
		}

	}

}
