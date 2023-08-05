package com.xworkz.InheritanceChaining;

public class Gold {
	public String shopLocation;
	public double price;
	public String material;
	public String state;
	
	public Gold(String shopLocation,double price,String material,String state) {
		this.shopLocation=shopLocation;
		this.price=price;
		this.material=material;
		this.state=state;
		System.out.println("Invoking String,double,String,String constructor in Gold");
	}
}
