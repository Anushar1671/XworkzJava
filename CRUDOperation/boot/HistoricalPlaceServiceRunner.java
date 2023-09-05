package com.xworkz.CRUDOperation.boot;

import com.xworkz.CRUDOperation.app.repository.HistoricalPlaceRepository;
import com.xworkz.CRUDOperation.app.repository.HistoricalPlaceRepositoryImpl;
import com.xworkz.CRUDOperation.app.service.HistoricalPlaceService;
import com.xworkz.CRUDOperation.app.service.HistoricalPlaceServiceImpl;

public class HistoricalPlaceServiceRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in HistoricalPlaceRunner");
		HistoricalPlaceRepository historicalPlaceRepository=new HistoricalPlaceRepositoryImpl();
		HistoricalPlaceService historicalPlaceService=new HistoricalPlaceServiceImpl(historicalPlaceRepository);
		historicalPlaceService.validateHistory("Mysore palace");
	}

}
