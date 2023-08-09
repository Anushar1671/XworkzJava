package com.xworkz.Polymorphism;

public class Pg extends Hostel {
	@Override
	public void stay() {
		System.out.println("Pg overrides Hostel");
		super.stay();
	}

	@Override
	public void stay(String name) {
		super.stay(name);
	}

	@Override
	public void stay(String name, double fees) {
		super.stay(name, fees);
	}

	@Override
	public void stay(String name, double fees, int since) {
		super.stay(name, fees, since);
	}

	@Override
	public void stay(String name, double fees, int since, boolean good) {
		super.stay(name, fees, since, good);
	}

	@Override
	public void stay(String name, double fees, int since, boolean good, int noOfStudents) {
		super.stay(name, fees, since, good, noOfStudents);
	}

}
