package com.xworkz.CRUDOperation.boot;

import com.xworkz.CRUDOperation.app.repository.PolitcianRepository;
import com.xworkz.CRUDOperation.app.repository.PolitcianRepositoryImpl;
import com.xworkz.CRUDOperation.app.service.PoliticianService;
import com.xworkz.CRUDOperation.app.service.PoliticianServiceImpl;

public class PoliticianServiceRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in PoliticianServiceRunner");
		PolitcianRepository politcianRepository = new PolitcianRepositoryImpl();
		PoliticianService politicianService = new PoliticianServiceImpl(politcianRepository);
		politicianService.validateExperience("BNG");
	}

}
