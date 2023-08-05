package com.xworkz.InheritanceChaining;

public class GoldSmith extends Gold{
	public GoldSmith() {
		this("Banglore",50000,"Chain","Solid");
		System.out.println("no-arg constructor in GoldSmith");
	}
	
	public GoldSmith(String shopLocation,double price,String material,String state) {
		super(shopLocation,price,material,state);
		System.out.println("String,double,String,String constructor in GoldSmith");
	}

}
