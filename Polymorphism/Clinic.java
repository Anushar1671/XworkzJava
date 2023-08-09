package com.xworkz.Polymorphism;

public class Clinic extends Hospital {
	@Override
	public void treatment() {
		System.out.println("Clinic overrides Hospital");
		super.treatment();
	}

	@Override
	public void treatment(String name) {
		super.treatment(name);
	}

	@Override
	public void treatment(String name, int noOfDoctors) {
		super.treatment(name, noOfDoctors);
	}

	@Override
	public void treatment(String name, int noOfDoctors, double fees) {
		super.treatment(name, noOfDoctors, fees);
	}

	@Override
	public void treatment(String name, int noOfDoctors, double fees, boolean goodService) {
		super.treatment(name, noOfDoctors, fees, goodService);
	}

	@Override
	public void treatment(String name, int noOfDoctors, double fees, boolean goodService, String address) {
		super.treatment(name, noOfDoctors, fees, goodService, address);
	}

}
