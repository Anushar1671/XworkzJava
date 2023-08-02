package com.xworkz.Inheritance;

public class Flower extends Tree{
	public String color;
	
	public Flower() {
		System.out.println("no-arg constructor in Flower");
	}
	
	public void flowerInfo() {
		System.out.println("Invoking flowerInfo in Flower");
	}

}
