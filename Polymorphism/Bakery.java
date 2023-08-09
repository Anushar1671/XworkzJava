package com.xworkz.Polymorphism;

public class Bakery {
	public void sweet() {
		System.out.println("Invoking no-arg in sweet");
	}

	public void sweet(String name) {
		System.out.println("Invoking String in sweet");
	}

	public void sweet(String name, double cost) {
		System.out.println("Invoking String,double in sweet");
	}

	public void sweet(String name, double cost, int quantity) {
		System.out.println("Invoking String,double,int in sweet");
	}

	public void sweet(String name, double cost, int quantity, boolean tasty) {
		System.out.println("Invoking String,double,int,boolean in sweet");
	}

	public void sweet(String name, double cost, int quantity, boolean tasty, String color) {
		System.out.println("Invoking String,double,int,boolean,String in sweet");
	}

}
