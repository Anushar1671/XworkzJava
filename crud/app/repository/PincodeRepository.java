package com.xworkz.crud.app.repository;

public interface PincodeRepository {
	int TOTAL_ITEMS = 5;

	void storeNumber(int pnumber);

	default boolean isExists(int pnumber) {
		return false;
	}

}
