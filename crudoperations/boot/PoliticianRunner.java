package com.xworkz.CRUDOperation.boot;

import com.xworkz.CRUDOperation.app.repository.PolitcianRepository;
import com.xworkz.CRUDOperation.app.repository.PolitcianRepositoryImpl;

public class PoliticianRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in PoliticianRunner");
		PolitcianRepository politcianRepository = new PolitcianRepositoryImpl();
		politcianRepository.experience("Siddaramayya");
		politcianRepository.experience("DK Shivakumar");
		politcianRepository.experience("Suresh");
		politcianRepository.experience("BY Raghavendra");
		politcianRepository.experience("Yadiyurappa");
		politcianRepository.experience("Kumarswami");
		politcianRepository.experience("Devegowda");
		politcianRepository.experience("TejaswiSurya");
		politcianRepository.experience("R Ashok");
		politcianRepository.experience("Modi");

	}

}
