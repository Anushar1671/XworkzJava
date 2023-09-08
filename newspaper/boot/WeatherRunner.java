package com.xworkz.newspaper.boot;

import com.xworkz.newspaper.app.dto.WeatherDTO;
import com.xworkz.newspaper.app.repository.WeatherRepository;
import com.xworkz.newspaper.app.repository.WeatherRepositoryImpl;
import com.xworkz.newspaper.app.service.WeatherService;
import com.xworkz.newspaper.app.service.WeatherServiceImpl;

public class WeatherRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in WeatherRunner");
		WeatherRepository weatherRepository = new WeatherRepositoryImpl();
		WeatherService weatherService = new WeatherServiceImpl();
		WeatherDTO dto = new WeatherDTO("Banglore", "Normal", 35, 80);
		boolean saved = weatherService.vaildateAndSave(dto);
		System.out.println("Persisted " + saved);
	}

}
