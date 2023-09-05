package com.xworkz.CRUDOperation.app.service;

import com.xworkz.CRUDOperation.app.repository.ArtistRepository;

public class ArtistServiceImpl implements ArtistService {
	private ArtistRepository artistRepository;

	public ArtistServiceImpl(ArtistRepository artistRepository) {
		this.artistRepository = artistRepository;
	}

	@Override
	public void validateAndMovie(String name) {
		System.out.println("invoking validateAndMovie from " + this.getClass().getSimpleName());
		if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20) {
			System.out.println("Artist data is valid");
			this.artistRepository.movie(name);;
		} else {
			System.out.println("Artist data invalid");
		}

	}

}
