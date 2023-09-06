package com.xworkz.crud.app.repository;

public class PincodeRepositoryImpl implements PincodeRepository {
	private int[] numbres = new int[TOTAL_ITEMS];
	private int position;

	@Override
	public void storeNumber(int pnumber) {
		System.out.println("Invoking storeNumber in PincodeRepositoryImpl");
		if (position < TOTAL_ITEMS) {
			this.numbres[position] = pnumber;
			System.out.println("Pincode number " + pnumber + " is at position " + this.position);
			this.position++;

		} else {
			System.err.println("Index is full connot store more data");
		}

	}

	@Override
	public boolean isExists(int pnumber) {
		for (int index = 0; index < this.position; index++) {
			long temp = this.numbres[index];
			if (temp != 0 && temp == pnumber) {
				System.out.println("Number already exist..");
				return true;
			}
		}
		return PincodeRepository.super.isExists(pnumber);
	}

}
