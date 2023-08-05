package com.xworkz.InheritanceChaining;

public class PoisonMushroom extends Mushroom{
	public PoisonMushroom() {
		this("brown",500,2, true);
		System.out.println("no-arg constructor in PoisonMushroom");
	}
	public PoisonMushroom(String color,double price,int quantity,boolean quality) {
		super(color,price,quantity, quality);
		System.out.println("String,double,int,boolean constructor in PoisonMushroom");
	}
}
