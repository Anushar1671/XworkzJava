package com.xworkz.InheritanceChaining;

public class ColdCoffee extends Coffee{
	public ColdCoffee() {
		this("bru",20,true,2);
		System.out.println("no-arg constructor in ColdCoffee");
	}
	
	public ColdCoffee(String brand,double cost,boolean tasty,int quantity) {
		super(brand,cost,tasty,quantity);
		System.out.println("String,double,boolean,int constructor in ColdCoffee");
	}

}
