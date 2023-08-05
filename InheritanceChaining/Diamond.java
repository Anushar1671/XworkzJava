package com.xworkz.InheritanceChaining;

public class Diamond {
	public String state;
	public double price;
	public String address;
	public int weight;
	
	public Diamond(String state,double price,String address,int weight) {
		this.state=state;
		this.price=price;
		this.address=address;
		this.weight=weight;
		System.out.println("Invoking String,double,String,int constructor in Diamond");
	}

}
