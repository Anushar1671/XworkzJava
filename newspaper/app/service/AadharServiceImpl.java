package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.AadharDTO;
import com.xworkz.newspaper.app.repository.AadharRepository;

public class AadharServiceImpl implements AadharService {
	private AadharRepository aadharRepository;

	public AadharServiceImpl(AadharRepository aadharRepository) {
		this.aadharRepository = aadharRepository;
	}

	@Override
	public boolean vaildateAndSave(AadharDTO dto) {
		if (dto != null) {

			String citizen = dto.getCitizen();
			String name = dto.getName();
			double number = dto.getNumber();
			int pincode = dto.getPincode();

			if (citizen != null && !citizen.isEmpty() && citizen.length() > 3 && citizen.length() <= 20) {
				System.out.println("citizen is valid");
			} else {
				System.err.println("ctizen is invalid");
				return false;
			}

			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() <= 20) {
				System.out.println("name is valid");
			} else {
				System.err.println("name is invalid");
				return false;
			}

			if (number != 0 && number >= 0) {
				System.out.println("number is valid");
			} else {
				System.err.println("number is invalid");
				return false;
			}

			if (pincode != 0 && pincode >= 0) {
				System.out.println("pincode is valid");
			} else {
				System.err.println("pincode is invalid");
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
