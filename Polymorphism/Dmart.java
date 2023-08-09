package com.xworkz.Polymorphism;

public class Dmart extends Mall {
	@Override
	public void shop() {
		System.out.println("Dmart overrides Mall");
		super.shop();
	}

	@Override
	public void shop(String name) {
		super.shop(name);
	}

	@Override
	public void shop(String name, boolean parking) {
		super.shop(name, parking);
	}

	@Override
	public void shop(String name, boolean parking, int since) {
		super.shop(name, parking, since);
	}

	@Override
	public void shop(String name, boolean parking, int since, String address) {
		super.shop(name, parking, since, address);
	}

	@Override
	public void shop(String name, boolean parking, int since, String address, boolean open) {
		super.shop(name, parking, since, address, open);
	}
}
