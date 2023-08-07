package com.xworkz.Overloading;

public class Specs {
	public void lens() {
		System.out.println("Invoking lens in Specs");
		lens("Convex");
		lens(2500);
	}
	
	public void lens(String type) {
		System.out.println("Invoking String in lens");
		System.out.println("Type of lens "+type);
	}
	
	public void lens(double price) {
		System.out.println("Invoking double in lens");
		System.out.println("Price of lens "+price);
	}
	
	public void lens(String type,double price) {
		System.out.println("Invoking double,boolean lens");
		lens(type);
		lens(price);
	}

}
