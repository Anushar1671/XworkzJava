package com.xworkz.Polymorphism;

public class WildLife extends Zoo {
	@Override
	public void animal() {
		System.out.println("WildLife overrides Zoo");
		super.animal();
	}

	@Override
	public void animal(String name) {
		super.animal(name);
	}

	@Override
	public void animal(String name, boolean protect) {
		super.animal(name, protect);
	}

	@Override
	public void animal(String name, boolean protect, int number) {
		super.animal(name, protect, number);
	}

	@Override
	public void animal(String name, boolean protect, int number, boolean healthy) {
		super.animal(name, protect, number, healthy);
	}

	@Override
	public void animal(String name, boolean protect, int number, boolean healthy, String color) {
		super.animal(name, protect, number, healthy, color);
	}

}
