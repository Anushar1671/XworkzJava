package com.xworkz.Inheritance;

public class PartTimeEmployee extends FullTimeEmployee{
	public float duration;
	
	public PartTimeEmployee() {
		System.out.println("no-arg constructor in PartTimeEmployee");
	}

	public void salary() {
		System.out.println("Invoking salary in PartTimeEmployee");
	}
}
