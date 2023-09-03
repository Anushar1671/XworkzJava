package com.xworkz.CRUDOperation.app.repository;

public class PatientRepositoryImpl implements PatientRepository {
	private String[] name=new String[ITEM_NUMBES];
	int position;
	@Override
	public void place(String name) {
		System.out.println("Invoking save in PatientRepositoryImpl");
		if (position < ITEM_NUMBES) {
			this.name[position] = name;
			System.out.println("Patient " + name + " is at " + this.position);
			this.position++;

		} else {
			System.err.println("Index is full");
		}
		
	}

}
