package com.xworkz.Polymorphism;

public class SuperMarket extends Market {
	@Override
	public void sale() {
		System.out.println("SuperMarket overrides Market");
		super.sale();
	}

	@Override
	public void sale(String thing) {
		super.sale(thing);
	}

	@Override
	public void sale(String thing, double cost) {
		super.sale(thing, cost);
	}

	@Override
	public void sale(String thing, double cost, String location) {
		super.sale(thing, cost, location);
	}

	@Override
	public void sale(String thing, double cost, String location, int quantity) {
		super.sale(thing, cost, location, quantity);
	}

	@Override
	public void sale(String thing, double cost, String location, int quantity, boolean quality) {
		super.sale(thing, cost, location, quantity, quality);
	}

}
