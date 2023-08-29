package com.xworkz.Farmer.app;

public class Trainer {
	private String name;
	private Laptop laptop;

	public Trainer(String name) {
		this.name = name;

	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void storage() {
		System.out.println("Invoking storage in Trainer");
		this.laptop.brand();

	}

}
