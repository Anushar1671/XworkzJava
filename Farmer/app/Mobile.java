package com.xworkz.Farmer.app;

public class Mobile {
	private String color;
	private Charger charger;

	public Mobile() {
		this.color = color;
	}

	public void setCharger(Charger charger) {
		this.charger = charger;
	}

	public void storage() {
		System.out.println("Invoking storage in Mobile");
	}

	public void brand() {
		System.out.println("Invoking brand in Mobile");
	}

	public double price() {
		System.out.println("Invoking price in Mobile");
		return 10000;
	}

	public String color() {
		System.out.println("Invoking color in Mobile");
		this.charger.capacity();
		this.charger.company();
		this.charger.inputVoltage();
		this.charger.model();
		return "Gold";
	}

}
