package com.xworkz.CRUDOperation.boot;

import com.xworkz.CRUDOperation.app.repository.PilotRepository;
import com.xworkz.CRUDOperation.app.repository.PilotRepositoryImpl;

public class PilotRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in PilotRunner");
		PilotRepository pilotRepository = new PilotRepositoryImpl();
		pilotRepository.navigation("Anusha");
		pilotRepository.navigation("Aishu");
		pilotRepository.navigation("Abhi");
		pilotRepository.navigation("Chandu");
		pilotRepository.navigation("Jeevan");
		pilotRepository.navigation("Anu");
		pilotRepository.navigation("Aishwarya");
		pilotRepository.navigation("Abhishek");
		pilotRepository.navigation("Chandan");
		pilotRepository.navigation("Namratha");
	}

}
