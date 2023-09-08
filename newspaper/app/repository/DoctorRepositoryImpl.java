package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.DoctorDTO;

public class DoctorRepositoryImpl implements DoctorRepository {

	private DoctorDTO[] dtos = new DoctorDTO[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(DoctorDTO dto) {
		System.out.println("Invoking save in DoctorRepositoryImpl");
		if (position < TOTAL_ITEMS) {
			this.dtos[TOTAL_ITEMS] = dto;
			System.out.println(dto + " at position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is full");
		}

	}

}
