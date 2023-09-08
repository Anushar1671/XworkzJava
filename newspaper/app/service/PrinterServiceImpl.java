package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.PrinterDTO;
import com.xworkz.newspaper.app.repository.PrinterRepository;

public class PrinterServiceImpl implements PrinterService {
	private PrinterRepository printerRepository;

	@Override
	public boolean vaildateAndSave(PrinterDTO dto) {
		if (dto != null) {

			String brand = dto.getBrand();
			String color = dto.getColor();
			double price = dto.getPrice();
			String type = dto.getType();

			if (brand != null && !brand.isEmpty() && brand.length() > 3 && brand.length() <= 20) {
				System.out.println("brand is valid");
			} else {
				System.err.println("brand is invalid");
				return false;
			}

			if (color != null && !color.isEmpty() && color.length() > 3 && color.length() <= 20) {
				System.out.println("color is valid");
			} else {
				System.err.println("color is invalid");
				return false;
			}

			if (price != 0 && price >= 0) {
				System.out.println("price is valid");
			} else {
				System.err.println("price is invalid");
				return false;
			}

			if (type != null && !type.isEmpty() && type.length() > 3 && type.length() <= 20) {
				System.out.println("type is valid");
			} else {
				System.err.println("type is invalid");
				return false;
			}
			System.out.println("Data is valid");
			
			return true;
		} else {
			System.err.println("Data invalid");
		}
		return false;
	}

}
