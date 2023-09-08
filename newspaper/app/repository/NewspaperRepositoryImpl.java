package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.NewspaperDTO;

public class NewspaperRepositoryImpl implements NewspaperRepository {
	private NewspaperDTO[] dtos = new NewspaperDTO[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(NewspaperDTO dto) {
		System.out.println("Invoking save in NewspaperRepositoryImpl");
		if (position < TOTAL_ITEMS) {
			this.dtos[position] = dto;
			System.out.println(dto + " at position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is full");
		}

	}

}
