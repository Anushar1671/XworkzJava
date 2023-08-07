package com.xworkz.Overloading;

public class Umbrella {
	public void protectFromRain() {
		System.out.println("Invoking rain in Umbrella");
		protectFromRain("Black");
		protectFromRain(500);
	}
	public void protectFromRain(String color) {
		System.out.println("Invoking String in rain");
		System.out.println("Umbrella color "+color);
	}
	
	public void protectFromRain(double price) {
		System.out.println("Invoking double in rain");
		System.out.println("Price of Umbrella "+price);
	}
	
	public void protectFromRain(String color,double price) {
		System.out.println("Invoking String,double rain");
		protectFromRain(color);
		protectFromRain(price);
	}

}
