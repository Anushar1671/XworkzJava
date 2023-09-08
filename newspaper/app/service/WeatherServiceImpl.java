package com.xworkz.newspaper.app.service;

import java.util.concurrent.locks.Condition;

import com.xworkz.newspaper.app.dto.WeatherDTO;
import com.xworkz.newspaper.app.repository.WeatherRepository;

public class WeatherServiceImpl implements WeatherService {
	private WeatherRepository weatherrRepository;

	@Override
	public boolean vaildateAndSave(WeatherDTO dto) {
		if (dto != null) {

			String condition = dto.getCondition();
			String location = dto.getLocation();
			double humidity = dto.getHumidity();
			int temp = dto.getTemperature();

			if (condition != null && !condition.isEmpty() && condition.length() > 3 && condition.length() <= 20) {
				System.out.println("condition is valid");
			} else {
				System.err.println("condition is invalid");
				return false;
			}

			if (location != null && !location.isEmpty() && location.length() > 3 && location.length() <= 20) {
				System.out.println("location is valid");
			} else {
				System.err.println("location is invalid");
				return false;
			}

			if (humidity != 0 && humidity >= 0) {
				System.out.println("humidity is valid");
			} else {
				System.err.println("humidity is invalid");
				return false;
			}

			if (temp != 0 && temp >= 0) {
				System.out.println("temp is valid");
			} else {
				System.err.println("temp is invalid");
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
