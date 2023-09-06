package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.PincodeRepository;

public class PincodeServiceImpl implements PincodeService {
	private PincodeRepository pincodeRepository;

	public PincodeServiceImpl(PincodeRepository pincodeRepository) {
		this.pincodeRepository = pincodeRepository;
	}

	@Override
	public boolean validateAndStoreNumber(int pnumber) {
		System.out.println("Invoking validateAndStoreNumber in PincodeServiceImpl" + this.getClass().getSimpleName());
		if (pnumber != 0) {
			System.out.println("Data is valid");
			if (!this.pincodeRepository.isExists(pnumber)) {
				this.pincodeRepository.storeNumber(pnumber);
				return true;
			} else {
				System.err.println("Pincode no " + pnumber + " already exist choose another one...");
			}
		}

		else {
			System.err.println("Invalid data");
		}

		return false;
	}

}
