package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.LocationRepository;

public class LocationServiceImpl implements LocationService {

	private LocationRepository locationRepository;

	public LocationServiceImpl(LocationRepository locationRepository) {
		this.locationRepository = locationRepository;
	}

	@Override
	public boolean validateAndStoreLocation(String lname) {
		System.out
				.println("Invoking validateAndStoreLocation in LocationServiceImpl" + this.getClass().getSimpleName());
		if (lname != null && !lname.isEmpty() && lname.length() > 3 && lname.length() <= 20) {
			System.out.println("Data is valid");
			if (!this.locationRepository.isExist(lname)) {
				this.locationRepository.storeLocation(lname);
				return true;
			} else {
				System.err.println("Location name " + lname + " already exist choose another one...");
			}
		}

		else {
			System.err.println("Invalid data");
		}

		return false;
	}

}
