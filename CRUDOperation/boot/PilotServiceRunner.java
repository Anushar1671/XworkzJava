package com.xworkz.CRUDOperation.boot;

import com.xworkz.CRUDOperation.app.repository.PilotRepository;
import com.xworkz.CRUDOperation.app.repository.PilotRepositoryImpl;
import com.xworkz.CRUDOperation.app.service.PilotService;
import com.xworkz.CRUDOperation.app.service.PilotServiceImpl;

public class PilotServiceRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in PilotRunner");
		PilotRepository pilotRepository = new PilotRepositoryImpl();
		PilotService pilotService = new PilotServiceImpl(pilotRepository);
		pilotService.validateNavigation("Banglore");
	}

}
