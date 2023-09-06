package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.CountryRepository;

public class CountryServiceImpl implements CountryService {
	private CountryRepository countryRepository;

	public CountryServiceImpl(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	@Override
	public boolean validateAndStore(String cname) {
		System.out.println("Invoking validateAndStore in CountryServiceImpl" + this.getClass().getSimpleName());
		if (cname != null && !cname.isEmpty() && cname.length() > 3 && cname.length() <= 20) {
			System.out.println("Data is valid");
			if (!this.countryRepository.isExist(cname)) {
				this.countryRepository.store(cname);
				return true;
			} else {
				System.err.println("Country name " + cname + " already exist choose another one...");
			}
		}

		else {
			System.err.println("Invalid data");
		}

		return false;
	}

}
