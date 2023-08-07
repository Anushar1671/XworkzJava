package com.xworkz.Overloading;

public class Plier {
	public void cutting() {
		System.out.println("Invoking cutting in Plier");
		cutting("tool");
		cutting(50);
	}
	public void cutting(String type) {
		System.out.println("Invoking String in cutting");
		System.out.println("Plier type  "+type);
	}
	
	public void cutting(double cost) {
		System.out.println("Invoking double in cutting");
		System.out.println("Cost of Plier "+cost);
	}
	
	public void cutting(String type,double cost) {
		System.out.println("Invoking String,double cutting");
		cutting(type);
		cutting(cost);
	}

}
