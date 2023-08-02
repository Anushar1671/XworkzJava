package com.xworkz.Inheritance;

public class Egg extends Bird{
	public String Shape;
	
	public Egg() {
		System.out.println("no-arg constructor in Egg");
	}
	
	public void eggInfo() {
		System.out.println("Invoking eggInfo in Egg");
	}
}
