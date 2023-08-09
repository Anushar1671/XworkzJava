package com.xworkz.Polymorphism;

public class SmartCity extends City {
	@Override
	public void town() {
		System.out.println("SmartCity overrides City");
		super.town();
	}

	@Override
	public void town(String name) {
		super.town(name);
	}

	@Override
	public void town(String name, boolean clean) {
		super.town(name, clean);
	}

	@Override
	public void town(String name, boolean clean, String famousFood) {
		super.town(name, clean, famousFood);
	}

	@Override
	public void town(String name, boolean clean, String famousFood, boolean transportation) {
		super.town(name, clean, famousFood, transportation);
	}

	@Override
	public void town(String name, boolean clean, String famousFood, boolean transportation, int noOfFamousPlace) {
		super.town(name, clean, famousFood, transportation, noOfFamousPlace);
	}
}
