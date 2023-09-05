package com.xworkz.CRUDOperation.app.service;

import com.xworkz.CRUDOperation.app.repository.PolitcianRepository;

public class PoliticianServiceImpl implements PoliticianService {
	private PolitcianRepository politcianRepository;

	public PoliticianServiceImpl(PolitcianRepository politcianRepository) {
		this.politcianRepository = politcianRepository;
	}

	@Override
	public boolean validateExperience(String name) {
		System.out.println("invoking validateExperience from " + this.getClass().getSimpleName());
		if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20) {
			System.out.println("Politician data is valid");
			this.politcianRepository.experience(name);
		} else {
			System.out.println("Politician data invalid");
		}
		return false;
	}

}
