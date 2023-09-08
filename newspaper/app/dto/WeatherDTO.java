package com.xworkz.newspaper.app.dto;

public class WeatherDTO {
	private String location;
	private String condition;
	private int temperature;
	private int humidity;

	public WeatherDTO() {
		super();
	}

	public WeatherDTO(String location, String condition, int temperature, int humidity) {
		super();
		this.location = location;
		this.condition = condition;
		this.temperature = temperature;
		this.humidity = humidity;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	@Override
	public String toString() {
		return "WeatherDTO [location=" + location + ", condition=" + condition + ", temperature=" + temperature
				+ ", humidity=" + humidity + "]";
	}

}
