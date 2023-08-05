package com.xworkz.InheritanceChaining;

public class Rope {
	public String material;
	public double cost;
	public int length;
	public String otherName;
	
	public Rope(String material,double cost,int length,String otherName) {
		this.material=material;
		this.cost=cost;
		this.length=length;
		this.otherName=otherName;
		System.out.println("Invoking String,double,int,String constructor in Rope");
	}

}
