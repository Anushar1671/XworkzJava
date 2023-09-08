package com.xworkz.newspaper.boot;

import com.xworkz.newspaper.app.dto.PrinterDTO;
import com.xworkz.newspaper.app.repository.PrinterRepository;
import com.xworkz.newspaper.app.repository.PrinterRepositoryImpl;
import com.xworkz.newspaper.app.service.PrinterService;
import com.xworkz.newspaper.app.service.PrinterServiceImpl;

public class PrinterRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in PrinterRunner");
		PrinterRepository printerRepository = new PrinterRepositoryImpl();
		PrinterService printerService = new PrinterServiceImpl();
		PrinterDTO dto = new PrinterDTO("Epson", "Black", 15000,"Black and white");
		boolean saved = printerService.vaildateAndSave(dto);
		System.out.println("Persisted " + saved);
	}


	}


