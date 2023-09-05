package com.xworkz.CRUDOperation.boot;

import com.xworkz.CRUDOperation.app.repository.PatientRepository;
import com.xworkz.CRUDOperation.app.repository.PatientRepositoryImpl;

public class PatientRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in PatientRunner");
		PatientRepository patientRepository = new PatientRepositoryImpl();
		patientRepository.place("Banglore");
		patientRepository.place("Mysore");
		patientRepository.place("Tarikere");
		patientRepository.place("Shimoga");
		patientRepository.place("Bhadravathi");
		patientRepository.place("RajajiNagar");
		patientRepository.place("Hasan");
		patientRepository.place("Chikkamagaluru");
		patientRepository.place("Davanagere");
		patientRepository.place("Birur");
	}

}
