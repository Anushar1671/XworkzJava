package com.xworkz.Polymorphism;

public class Restaurant extends Hotel {
	@Override
	public void food() {
		System.out.println("Restaurant overrides Hotel");
		super.food();
	}

	@Override
	public void food(String name) {
		super.food(name);
	}

	@Override
	public void food(String name, double cost) {
		super.food(name, cost);
	}

	@Override
	public void food(String name, double cost, int quantity) {
		super.food(name, cost, quantity);
	}

	@Override
	public void food(String name, double cost, int quantity, boolean tasty) {
		super.food(name, cost, quantity, tasty);
	}

	@Override
	public void food(String name, double cost, int quantity, boolean tasty, String quality) {
		// TODO Auto-generated method stub
		super.food(name, cost, quantity, tasty, quality);
	}

}
