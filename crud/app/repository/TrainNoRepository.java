package com.xworkz.crud.app.repository;

public interface TrainNoRepository {
	int TOTAL_ITEMS = 5;

	void storeNo(int tnumber);

	default boolean isExist(int tnumber) {
		return false;
	}

}
