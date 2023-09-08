package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.NewspaperDTO;
import com.xworkz.newspaper.app.repository.NewspaperRepository;

public class NewspaperServiceImpl implements NewspaperService {
	private NewspaperRepository newspaperRepository;

	public NewspaperServiceImpl(NewspaperRepository newspaperRepository) {
		this.newspaperRepository = newspaperRepository;

	}

	@Override
	public boolean validateAndSave(NewspaperDTO dto) {
		if (dto != null) {

			String lang = dto.getLang();
			String publisher = dto.getPublisher();
			double price = dto.getPrice();
			int noOfPages = dto.getnoOfPages();

			if (lang != null && !lang.isEmpty() && lang.length() > 3 && lang.length() <= 20) {
				System.out.println("lang is valid");
			} else {
				System.err.println("lang is invalid");
				return false;
			}

			if (publisher != null && !publisher.isEmpty() && publisher.length() > 3 && publisher.length() <= 20) {
				System.out.println("publisher is valid");
			} else {
				System.err.println("publisher is invalid");
				return false;
			}

			if (price != 0 && price >= 0) {
				System.out.println("price is valid");
			} else {
				System.err.println("price is invalid");
				return false;
			}

			if (noOfPages != 0 && noOfPages >= 0) {
				System.out.println("noOfPages is valid");
			} else {
				System.err.println("noOfPages is invalid");
				return false;
			}

			System.out.println("Data is valid");
			this.newspaperRepository.save(dto);
			return true;
		} else {
			System.err.println("Data invalid");
		}
		return false;
	}

}
