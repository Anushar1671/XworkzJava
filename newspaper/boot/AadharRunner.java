package com.xworkz.newspaper.boot;

import com.xworkz.newspaper.app.dto.AadharDTO;
import com.xworkz.newspaper.app.repository.AadharRepository;
import com.xworkz.newspaper.app.repository.AadharRepositoryImpl;
import com.xworkz.newspaper.app.service.AadharService;
import com.xworkz.newspaper.app.service.AadharServiceImpl;

public class AadharRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in AadharRunner");
		AadharRepository aadharRepository = new AadharRepositoryImpl();
		AadharService aadharService = new AadharServiceImpl(aadharRepository);
		AadharDTO dto = new AadharDTO("Anusha", 784512896l, "Indian", 577228);
		boolean saved = aadharService.vaildateAndSave(dto);
		System.out.println("Persisted "+saved);

	}

}
