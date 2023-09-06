package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.CountryRepository;
import com.xworkz.crud.app.repository.CountryRepositoryImpl;
import com.xworkz.crud.app.service.CountryService;
import com.xworkz.crud.app.service.CountryServiceImpl;

public class CountryRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in CountryRunner");
		CountryRepository countryRepository = new CountryRepositoryImpl();
		CountryService countryService = new CountryServiceImpl(countryRepository);
		boolean store = countryService.validateAndStore("India");
		System.out.println(store);
		countryService.validateAndStore("India");
		countryService.validateAndStore("America");

	}

}
