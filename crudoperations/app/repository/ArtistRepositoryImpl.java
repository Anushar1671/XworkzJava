package com.xworkz.CRUDOperation.app.repository;

public class ArtistRepositoryImpl implements ArtistRepository {

	private String[] movies = new String[NO_OF_ARTIST];
	int position;

	@Override
	public void movie(String name) {
		System.out.println("Invoking movie in ArtistRepositortImpl");
		if (position < NO_OF_ARTIST) {
			this.movies[position] = name;
			System.out.println("Movie " + name + " at position " + this.position);
			this.position++;
		} else {

			System.err.println("Inde is more");
		}

	}

}
