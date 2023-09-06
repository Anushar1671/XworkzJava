package com.xworkz.crud.app.service;

import com.xworkz.crud.app.repository.TrainNoRepository;

public class TrainNoServiceImpl implements TrainNoService {
	private TrainNoRepository trainNoRepository;

	public TrainNoServiceImpl(TrainNoRepository trainNoRepository) {
		this.trainNoRepository = trainNoRepository;
	}

	@Override
	public boolean validateAndStore(int tnumber) {
		System.out.println("Invoking validateAndStore in TrainNoServiceImpl" + this.getClass().getSimpleName());
		if (tnumber != 0) {
			System.out.println("Data is valid");
			if (!this.trainNoRepository.isExist(tnumber)) {
				this.trainNoRepository.storeNo(tnumber);
				return true;
			} else {
				System.err.println("Train number " + tnumber + " already exist choose another one...");
			}
		}

		else {
			System.err.println("Invalid data");
		}

		return false;
	}

}
