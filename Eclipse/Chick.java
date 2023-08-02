package com.xworkz.Inheritance;

public class Chick extends Egg{
	public String color;
	
	public Chick() {
		System.out.println("no-arg constructor in Chick");
	}
	
	public void chickInfo() {
		System.out.println("Invoking chickInfo in Chick");
	}
}
