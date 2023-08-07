package com.xworkz.Overloading;

public class IronBox {
	public void temperature() {
		System.out.println("Invoking temperature in IronBox");
		temperature(1500);
		temperature(true);
	}
	
	public void temperature(double price) {
		System.out.println("Invoking double in temperature");
		System.out.println("Price of Iron Box "+price);
	}
	
	public void temperature(boolean work) {
		System.out.println("Invoking boolean in temperature");
		System.out.println("Iron box is working "+work);
	}
	
	public void temperature(double price,boolean work) {
		System.out.println("Invoking double,boolean temperature");
		temperature(price);
		temperature(work);
	}

}
