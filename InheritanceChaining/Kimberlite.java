package com.xworkz.InheritanceChaining;

public class Kimberlite extends Diamond{
	public Kimberlite() {
		this("Solid",500000,"Banglore",5);
		System.out.println("no-arg constructor in Kimberlite");
	}
	
	public Kimberlite(String state,double price,String address,int weight) {
		super(state,price,address,weight);
		System.out.println("String,double,String,int constructor in Kimberlite");
	}

}
