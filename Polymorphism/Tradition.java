package com.xworkz.Polymorphism;

public class Tradition extends Temple {
	@Override
	public void prayer() {
		System.out.println("Tradition overrides Temple");
		super.prayer();
	}

	@Override
	public void prayer(String god) {
		super.prayer(god);
	}

	@Override
	public void prayer(String god, int openTime) {
		super.prayer(god, openTime);
	}

	@Override
	public void prayer(String god, int openTime, String location) {
		super.prayer(god, openTime, location);
	}

	@Override
	public void prayer(String god, int openTime, String location, int closeTime) {
		super.prayer(god, openTime, location, closeTime);
	}

	@Override
	public void prayer(String god, int openTime, String location, int closeTime, boolean entry) {
		super.prayer(god, openTime, location, closeTime, entry);
	}
}
