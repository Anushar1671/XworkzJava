package com.xworkz.crud.app.repository;

public class TrainNoRepositoryImpl implements TrainNoRepository {
	private int[] tnumbres = new int[TOTAL_ITEMS];
	private int position;

	@Override
	public void storeNo(int tnumber) {
		System.out.println("Invoking storeNo in TrainNoRepositoryImpl");
		if (position < TOTAL_ITEMS) {
			this.tnumbres[position] = tnumber;
			System.out.println("Train number " + tnumber + " is at position " + this.position);
			this.position++;

		} else {
			System.err.println("Index is full connot store more data");
		}

	}

	@Override
	public boolean isExist(int tnumber) {
		for (int index = 0; index < this.position; index++) {
			long temp = this.tnumbres[index];
			if (temp != 0 && temp == tnumber) {
				System.out.println("Number already exist..");
				return true;
			}
		}
		return TrainNoRepository.super.isExist(tnumber);
	}

}
