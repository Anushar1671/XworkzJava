package com.xworkz.Polymorphism;

public class BakeryInfo extends Bakery {
	@Override
	public void sweet() {
		System.out.println("BakeryInfo overrides Bakery");
		super.sweet();
	}

	@Override
	public void sweet(String name) {
		super.sweet(name);
	}

	@Override
	public void sweet(String name, double cost) {
		super.sweet(name, cost);
	}

	@Override
	public void sweet(String name, double cost, int quantity) {
		super.sweet(name, cost, quantity);
	}

	@Override
	public void sweet(String name, double cost, int quantity, boolean tasty) {
		super.sweet(name, cost, quantity, tasty);
	}

	@Override
	public void sweet(String name, double cost, int quantity, boolean tasty, String color) {
		super.sweet(name, cost, quantity, tasty, color);
	}

}
