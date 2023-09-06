package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.LocationRepository;
import com.xworkz.crud.app.repository.LocationRepositoryImpl;
import com.xworkz.crud.app.service.LocationService;
import com.xworkz.crud.app.service.LocationServiceImpl;

public class LocationRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in LocationRunner");
		LocationRepository locationRepository = new LocationRepositoryImpl();
		LocationService locationService = new LocationServiceImpl(locationRepository);
		boolean save = locationService.validateAndStoreLocation("Banglore");
		System.out.println(save);
		locationService.validateAndStoreLocation("Banglore");
		locationService.validateAndStoreLocation("Shimoga");

	}

}
