package com.xworkz.CRUDOperation.boot;

import com.xworkz.CRUDOperation.app.repository.ArtistRepository;
import com.xworkz.CRUDOperation.app.repository.ArtistRepositoryImpl;
import com.xworkz.CRUDOperation.app.service.ArtistService;
import com.xworkz.CRUDOperation.app.service.ArtistServiceImpl;

public class ArtistServiceRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in ArtistServiceRunner");
		ArtistRepository artistRepository = new ArtistRepositoryImpl();
		ArtistService artistService = new ArtistServiceImpl(artistRepository);
		artistService.validateAndMovie("SSE");
	}

}
