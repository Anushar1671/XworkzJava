package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.DoctorDTO;
import com.xworkz.newspaper.app.repository.DoctorRepository;

public class DoctorServiceImpl implements DoctorService {
	private DoctorRepository doctorRepository;

	public DoctorServiceImpl(DoctorRepository doctorRepository) {
		this.doctorRepository = doctorRepository;
	}

	@Override
	public boolean vaildateAndSave(DoctorDTO dto) {
		if (dto != null) {

			String name = dto.getName();
			String specification = dto.getSpecialization();
			double age = dto.getAge();
			int experience = dto.getExperience();

			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() <= 20) {
				System.out.println("name is valid");
			} else {
				System.err.println("name is invalid");
				return false;
			}

			if (specification != null && !specification.isEmpty() && specification.length() > 3
					&& specification.length() <= 20) {
				System.out.println("specification is valid");
			} else {
				System.err.println("specification is invalid");
				return false;
			}

			if (age != 0 && age >= 0) {
				System.out.println("age is valid");
			} else {
				System.err.println("age is invalid");
				return false;
			}

			if (experience != 0 && experience >= 0) {
				System.out.println("experience is valid");
			} else {
				System.err.println("experience is invalid");
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
