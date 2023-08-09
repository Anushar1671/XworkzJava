package com.xworkz.Polymorphism;

public class MusicPub extends Pub {
	@Override
	public void enjoy() {
		System.out.println("MusicPub overrides Pub");
		super.enjoy();
	}

	@Override
	public void enjoy(String name) {
		super.enjoy(name);
	}

	@Override
	public void enjoy(String name, int noOfDrinks) {
		super.enjoy(name, noOfDrinks);
	}

	@Override
	public void enjoy(String name, int noOfDrinks, String location) {
		super.enjoy(name, noOfDrinks, location);
	}

	@Override
	public void enjoy(String name, int noOfDrinks, String location, int openTime) {
		super.enjoy(name, noOfDrinks, location, openTime);
	}

	@Override
	public void enjoy(String name, int noOfDrinks, String location, int openTime, int closeTime) {
		super.enjoy(name, noOfDrinks, location, openTime, closeTime);
	}
}
