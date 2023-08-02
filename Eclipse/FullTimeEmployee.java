package com.xworkz.Inheritance;

public class FullTimeEmployee extends Employee{
	public double salary;
	
	public FullTimeEmployee() {
		System.out.println("no-arg constructor in FullTimeEmployee");
	}
	
	public void year() {
		System.out.println("Invoking year in FullTimeEmployee");
	}
}
