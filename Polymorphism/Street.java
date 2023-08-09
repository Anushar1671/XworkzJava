package com.xworkz.Polymorphism;

public class Street {
	public void area() {
		System.out.println("Invoking no-arg in area");
	}

	public void area(String name) {
		System.out.println("Invoking String in area");
	}

	public void area(String name, int block) {
		System.out.println("Invoking String,int in area");
	}

	public void area(String name, int block, boolean straight) {
		System.out.println("Invoking String,int,boolean in area");
	}

	public void area(String name, int block, boolean straight, int noOfRoads) {
		System.out.println("Invoking String,int,boolean,int in area");
	}

	public void area(String name, int block, boolean straight, int noOfRoads, boolean safe) {
		System.out.println("Invoking String,int,boolean,int,String in area");
	}

}
