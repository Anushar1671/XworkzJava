package com.xworkz.Polymorphism;

public class LocalPolice extends PoliceStation {
	@Override
	public void protect() {
		System.out.println("LocalPolice overrides PoliceStation");
		super.protect();
	}

	@Override
	public void protect(String name) {
		super.protect(name);
	}

	@Override
	public void protect(String name, int noOfCriminals) {
		super.protect(name, noOfCriminals);
	}

	@Override
	public void protect(String name, int noOfCriminals, String location) {
		super.protect(name, noOfCriminals, location);
	}

	@Override
	public void protect(String name, int noOfCriminals, String location, int noOfPolice) {
		super.protect(name, noOfCriminals, location, noOfPolice);
	}

	@Override
	public void protect(String name, int noOfCriminals, String location, int noOfPolice, boolean investigation) {
		super.protect(name, noOfCriminals, location, noOfPolice, investigation);
	}

}
