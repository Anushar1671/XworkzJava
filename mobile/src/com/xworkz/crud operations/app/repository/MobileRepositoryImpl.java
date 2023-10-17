package com.xworkz.crud.app.repository;

import com.xworkz.crud.app.dto.MobileDTO;

public class MobileRepositoryImpl implements MobileRepository {
	private MobileDTO[] dtos = new MobileDTO[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(MobileDTO dto) {
		System.out.println("Invoking save in MobileDTO");
		if (position < TOTAL_ITEMS) {
			this.dtos[position] = dto;
			System.out.println(dto + " is at position " + position);
			this.position++;
		} else {
			System.out.println("Storage is full.....");
		}

	}

	@Override
	public boolean isExist(MobileDTO dto) {
		System.out.println("Running isExist in " + this.getClass().getSimpleName());
		for (int index = 0; index < this.position; index++) {
			MobileDTO ref = this.dtos[index];
			if (ref != null && ref.equals(dto)) {
				System.out.println("Data already exist..");
				return true;
			}
		}
		return MobileRepository.super.isExist(dto);
	}

	@Override
	public MobileDTO findByBrand(String brand) {
		System.out.println("Invoking findByBrand in " + brand);
		for (int index = 0; index < this.position; index++) {
			MobileDTO dto = this.dtos[index];
			if (dto.getBrand().equals(brand)) {
				System.out.println("Dto found");
				return dto;
			}

		}
		return MobileRepository.super.findByBrand(brand);
	}

}
