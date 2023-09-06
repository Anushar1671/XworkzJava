package com.xworkz.crud.app.repository;

public interface LocationRepository {
	int TOTAL_ITEMS = 5;

	void storeLocation(String lname);

	default boolean isExist(String lname) {
		return false;
	}

}
