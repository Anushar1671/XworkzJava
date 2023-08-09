package com.xworkz.Polymorphism;

public class City {
	public void town() {
		System.out.println("Invoking no-arg in town");
	}

	public void town(String name) {
		System.out.println("Invoking String in town");
	}

	public void town(String name, boolean clean) {
		System.out.println("Invoking String,boolean in town");
	}

	public void town(String name, boolean clean, String famousFood) {
		System.out.println("Invoking String,boolean,String in town");
	}

	public void town(String name, boolean clean, String famousFood, boolean transportation) {
		System.out.println("Invoking String,boolean,String,boolean in town");
	}

	public void town(String name, boolean clean, String famousFood, boolean transportation, int noOfFamousPlace) {
		System.out.println("Invoking String,boolean,String,boolean,int in town");
	}

}
