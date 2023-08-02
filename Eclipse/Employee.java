package com.xworkz.Inheritance;

public class Employee extends JobRole{
	public float experience;
	
	public Employee() {
		System.out.println("no-arg constructor in Employee");
	}

	public void rating() {
		System.out.println("Invoking rating in Employee");
	}
}
