package com.xworkz.CRUDOperation.boot;

import com.xworkz.CRUDOperation.app.repository.ArtistRepository;
import com.xworkz.CRUDOperation.app.repository.ArtistRepositoryImpl;

public class ArtistRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in ArtistRunner");
		ArtistRepository artist = new ArtistRepositoryImpl();
		artist.movie("KGF1");
		artist.movie("Kantara");
		artist.movie("SSE");
		artist.movie("Kranthi");
		artist.movie("Kotigobba");
		artist.movie("Mungarumale");
		artist.movie("Kirik party");
		artist.movie("Banglore boys");
		artist.movie("Khushi");
		artist.movie("KGF2");

	}

}
