package com.xworkz.InheritanceChaining;

public class Mushroom {
	public String color;
	public double price;
	public int quantity;
	public boolean quality;
	
	public Mushroom(String color,double price,int quantity,boolean quality) {
		this.color=color;
		this.price=price;
		this.quantity=quantity;
		this.quality=quality;
		System.out.println("Invoking String,double,int,boolean constructor in Mushroom");
		
	}

}
