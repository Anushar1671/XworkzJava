package com.xworkz.newspaper.boot;

import com.xworkz.newspaper.app.dto.DoctorDTO;
import com.xworkz.newspaper.app.repository.DoctorRepository;
import com.xworkz.newspaper.app.repository.DoctorRepositoryImpl;
import com.xworkz.newspaper.app.service.DoctorService;
import com.xworkz.newspaper.app.service.DoctorServiceImpl;

public class DoctorRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in DoctorRunner");
		DoctorRepository doctorRepository = new DoctorRepositoryImpl();
		DoctorService doctorService = new DoctorServiceImpl(doctorRepository);
		DoctorDTO dto = new DoctorDTO("Abhi", 5, "EyeSpecialist", 35);
		boolean saved = doctorService.vaildateAndSave(dto);
		System.out.println("Persisted " + saved);
	}

}
