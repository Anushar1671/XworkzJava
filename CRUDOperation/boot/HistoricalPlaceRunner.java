package com.xworkz.CRUDOperation.boot;

import com.xworkz.CRUDOperation.app.repository.HistoricalPlaceRepository;
import com.xworkz.CRUDOperation.app.repository.HistoricalPlaceRepositoryImpl;

public class HistoricalPlaceRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in HistoricalPlaceRunner");
		HistoricalPlaceRepository historicalPlace = new HistoricalPlaceRepositoryImpl();
		historicalPlace.place("JogFalls");
		historicalPlace.place("Dharmastala");
		historicalPlace.place("Amruthapura");
		historicalPlace.place("Hampi");
		historicalPlace.place("Aihole");
		historicalPlace.place("Muradeshwara");
		historicalPlace.place("Horanadu");
		historicalPlace.place("Shivagange");
		historicalPlace.place("Halebidu");
		historicalPlace.place("Mysore");

	}

}
