package com.xworkz.Polymorphism;

public class Blocks extends Street {
	@Override
	public void area() {
		System.out.println("Blocks overrides Street");
		super.area();
	}

	@Override
	public void area(String name) {
		super.area(name);
	}

	@Override
	public void area(String name, int block) {
		super.area(name, block);
	}

	@Override
	public void area(String name, int block, boolean straight) {
		super.area(name, block, straight);
	}

	@Override
	public void area(String name, int block, boolean straight, int noOfRoads) {
		super.area(name, block, straight, noOfRoads);
	}

	@Override
	public void area(String name, int block, boolean straight, int noOfRoads, boolean safe) {
		super.area(name, block, straight, noOfRoads, safe);
	}
}
