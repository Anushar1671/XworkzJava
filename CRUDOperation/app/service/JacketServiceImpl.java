package com.xworkz.CRUDOperation.app.service;

import com.xworkz.CRUDOperation.app.repository.JacketRepsitory;

public class JacketServiceImpl implements JacketService {

	private JacketRepsitory jacketRepository;

	public JacketServiceImpl(JacketRepsitory jacketRepository) {
		this.jacketRepository = jacketRepository;
	}

	@Override
	public void validateBrand(String brand) {
		System.out.println("invoking validateBrand from " + this.getClass().getSimpleName());
		if (brand != null && !brand.isEmpty() && brand.length() >= 3 && brand.length() <= 20) {
			System.out.println("Jacket data is valid");
			this.jacketRepository.color(brand);
		} else {
			System.out.println("Jacket data invalid");
		}

	}

}
