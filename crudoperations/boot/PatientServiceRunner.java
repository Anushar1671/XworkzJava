package com.xworkz.CRUDOperation.boot;

import com.xworkz.CRUDOperation.app.repository.PatientRepository;
import com.xworkz.CRUDOperation.app.repository.PatientRepositoryImpl;
import com.xworkz.CRUDOperation.app.service.PatientService;
import com.xworkz.CRUDOperation.app.service.PatientServiceImpl;

public class PatientServiceRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in PatientRunner");
		PatientRepository patientRepository=new PatientRepositoryImpl();
		PatientService patientService=new PatientServiceImpl(patientRepository);
		patientService.validPlace("BNG");
	}
}
