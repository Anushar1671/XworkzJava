package com.xworkz.Polymorphism;

public class Pub {
	public void enjoy() {
		System.out.println("Invoking no-arg in enjoy");
	}

	public void enjoy(String name) {
		System.out.println("Invoking String in enjoy");
	}

	public void enjoy(String name, int noOfDrinks) {
		System.out.println("Invoking String,int in enjoy");
	}

	public void enjoy(String name, int noOfDrinks, String location) {
		System.out.println("Invoking String,int,String in enjoy");
	}

	public void enjoy(String name, int noOfDrinks, String location, int openTime) {
		System.out.println("Invoking String,int,String,int in enjoy");
	}

	public void enjoy(String name, int noOfDrinks, String location, int openTime, int closeTime) {
		System.out.println("Invoking String,int,String,int,int in enjoy");
	}

}
