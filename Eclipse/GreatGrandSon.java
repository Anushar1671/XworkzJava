package com.xworkz.Inheritance;

public class GreatGrandSon extends GrandSon{
	public String name;
	
	public GreatGrandSon() {
		System.out.println("no-arg constructor in GreatGrandSon");
	}
	
	public void info() {
		System.out.println("Invoking info in GreatGrandSon");
	}
}
