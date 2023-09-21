package com.xworkz.crud.boot;

import com.xworkz.crud.app.dto.MobileDTO;
import com.xworkz.crud.app.repository.MobileRepository;
import com.xworkz.crud.app.repository.MobileRepositoryImpl;
import com.xworkz.crud.app.service.MobileService;
import com.xworkz.crud.app.service.MobileServiceImpl;

public class MobileRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in MobileRunner");
		MobileRepository repository = new MobileRepositoryImpl();
		MobileService service = new MobileServiceImpl(repository);
		MobileDTO dto = new MobileDTO("Oppo", "gold", 15000, "PaiShop", 64, true, "ANUSHA", true, 45, "Banglore");
		boolean saved = service.validateAndSave(dto);
		System.out.println("Persisted " + saved);
		MobileDTO dto2 = service.findByBrand("Oppo");
		System.out.println("Found " + dto2);

	}

}
