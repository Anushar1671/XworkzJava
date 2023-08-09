package com.xworkz.Polymorphism;

public class Market {
	public void sale() {
		System.out.println("Invoking no-arg in sale");
	}

	public void sale(String thing) {
		System.out.println("Invoking String in sale");
	}

	public void sale(String thing, double cost) {
		System.out.println("Invoking String,double in sale");
	}

	public void sale(String thing, double cost, String location) {
		System.out.println("Invoking String,double,String in sale");
	}

	public void sale(String thing, double cost, String location, int quantity) {
		System.out.println("Invoking String,double,String,int in sale");
	}

	public void sale(String thing, double cost, String location, int quantity, boolean quality) {
		System.out.println("Invoking String,double,String,int,boolean in sale");
	}

}
