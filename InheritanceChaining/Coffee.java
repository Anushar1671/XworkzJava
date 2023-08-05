package com.xworkz.InheritanceChaining;

public class Coffee {
	public String brand;
	public double cost;
	public boolean tasty;
	public int quantity;
	
	public Coffee(String brand,double cost,boolean tasty,int quantity) {
		this.brand=brand;
		this.cost=cost;
		this.tasty=tasty;
		this.quantity=quantity;
		System.out.println("Invoking String,double,boolean,int constructor in Coffee");
	}

}
