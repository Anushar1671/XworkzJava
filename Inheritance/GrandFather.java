package com.xworkz.Inheritance;

public class GrandFather extends GreatGrandFather{
	public String name;
	
	public GrandFather() {
		System.out.println("no-arg constructor in GrandFather");
	}

	public void grandFatherInfo() {
		System.out.println("Invoking grandFatherInfo in GrandFather");
	}
}
