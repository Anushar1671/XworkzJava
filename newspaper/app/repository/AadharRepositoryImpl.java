package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.AadharDTO;

public class AadharRepositoryImpl implements AadharRepository {
	private AadharDTO[] dtos = new AadharDTO[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(AadharDTO dto) {
		System.out.println("Invoking save in AadharRepositoryImpl");
		if (position < TOTAL_ITEMS) {
			this.dtos[TOTAL_ITEMS] = dto;
			System.out.println(dto + " at position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is full");
		}

	}

}
