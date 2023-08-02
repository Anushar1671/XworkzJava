package com.xworkz.Inheritance;

public class Laptop extends DeskTop{
	public double price;
	
	public Laptop() {
		System.out.println("no-arg constructor in Laptop");
	}
	
	public void laptopInfo() {
		System.out.println("Invoking laptop in Laptop");
	}
}
