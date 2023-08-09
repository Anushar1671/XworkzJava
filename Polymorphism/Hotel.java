package com.xworkz.Polymorphism;

public class Hotel {
	public void food() {
		System.out.println("Invoking no-arg in food");
	}

	public void food(String name) {
		System.out.println("Invoking String in food");
	}

	public void food(String name, double cost) {
		System.out.println("Invoking String,double in food");
	}

	public void food(String name, double cost, int quantity) {
		System.out.println("Invoking String,double,int in food");
	}

	public void food(String name, double cost, int quantity, boolean tasty) {
		System.out.println("Invoking String,double,int,boolean in food");
	}

	public void food(String name, double cost, int quantity, boolean tasty, String quality) {
		System.out.println("Invoking String,double,int,boolean,String in food");
	}

}
