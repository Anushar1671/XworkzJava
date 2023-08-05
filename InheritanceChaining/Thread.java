package com.xworkz.InheritanceChaining;

public class Thread extends Rope{
	public Thread() {
		this("Fiber",500,100,"cable");
		System.out.println("no-arg constructor in Thread");
	}
	public Thread(String material,double cost,int length,String otherName) {
		super(material,cost,length,otherName);
		System.out.println("String,double,int,String constructor in Thread");
	}

}
