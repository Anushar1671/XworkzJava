package com.xworkz.Overloading;

public class Stapler {
	public void join() {
		System.out.println("Invoking join in Stapler");
		join("Metal");
		join(50);
	}
	public void join(String material) {
		System.out.println("Invoking String in join");
		System.out.println("Material used "+material);
	}
	
	public void join(double price) {
		System.out.println("Invoking double in join");
		System.out.println("Price of Stapler "+price);
	}
	
	public void join(String material,double price) {
		System.out.println("Invoking String,double join");
		join(material);
		join(price);
	}

}
