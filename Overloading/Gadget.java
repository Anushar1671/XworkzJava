package com.xworkz.Overloading;

public class Gadget {
	public void display() {
		System.out.println("Invoking display in Gadget");
		display("Mobile");
		display(15000);
	}
	public void display(String name) {
		System.out.println("Invoking String in display");
		System.out.println("Name of gadget "+name);
	}
	
	public void display(double price) {
		System.out.println("Invoking double in display");
		System.out.println("Price of gadget "+price);
	}
	
	public void display(String name,double price) {
		System.out.println("Invoking String,double display");
		display(name);
		display(price);
	}
}
