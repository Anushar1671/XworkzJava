package com.xworkz.newspaper.boot;

import com.xworkz.newspaper.app.dto.NewspaperDTO;
import com.xworkz.newspaper.app.repository.NewspaperRepository;
import com.xworkz.newspaper.app.repository.NewspaperRepositoryImpl;
import com.xworkz.newspaper.app.service.NewspaperService;
import com.xworkz.newspaper.app.service.NewspaperServiceImpl;

public class NewspaperRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in NewspaperRunner");
		NewspaperRepository newspaperRepository = new NewspaperRepositoryImpl();
		NewspaperService newspaperService = new NewspaperServiceImpl(newspaperRepository);
		NewspaperDTO dto = new NewspaperDTO("Kannada", 20, 5, "Vijaya Karnataka");
		boolean saved = newspaperService.validateAndSave(dto);
		System.out.println("Persisted " + saved);
	}

}
