package com.xworkz.Inheritance;

public class Salary extends PartTimeEmployee{
	public float experience;
	
	public Salary() {
		System.out.println("no-arg constructor in Salary");
	}
	
	public void salaryInfo() {
		System.out.println("Invoking salaryInfo in Salary");
	}

}
