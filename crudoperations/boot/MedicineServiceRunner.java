package com.xworkz.CRUDOperation.boot;

import com.xworkz.CRUDOperation.app.repository.MedicineRepository;
import com.xworkz.CRUDOperation.app.repository.MedicineRepositoryImpl;
import com.xworkz.CRUDOperation.app.service.MedicineService;
import com.xworkz.CRUDOperation.app.service.MedicineServiceImpl;

public class MedicineServiceRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in MedicineServiceRunner");
		MedicineRepository medicineRepository = new MedicineRepositoryImpl();
		MedicineService medicineService = new MedicineServiceImpl(medicineRepository);
		medicineService.validateName("Cipla");

	}

}
