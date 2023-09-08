package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.PrinterDTO;

public class PrinterRepositoryImpl implements PrinterRepository {
	private PrinterDTO[] dtos = new PrinterDTO[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(PrinterDTO dto) {
		System.out.println("Invoking save in PrinterRepositoryImpl");
		if (position < TOTAL_ITEMS) {
			this.dtos[TOTAL_ITEMS] = dto;
			System.out.println(dto + " at position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is full");
		}

	}

}
