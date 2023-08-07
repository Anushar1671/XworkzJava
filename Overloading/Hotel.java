package com.xworkz.Overloading;

public class Hotel {
	public void service() {
		System.out.println("Invoking service in Hotel");
		service("Idli");
		service(50);
	}
	public void service(String item) {
		System.out.println("Invoking String in service");
		System.out.println("Item name "+item);
	}
	
	public void service(double price) {
		System.out.println("Invoking double in service");
		System.out.println("Price of food "+price);
	}
	
	public void service(String item,double price) {
		System.out.println("Invoking String,double service");
		service(item);
		service(price);
	}
}
