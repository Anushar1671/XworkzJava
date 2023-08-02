package com.xworkz.Inheritance;

public class JobRole extends Job{
	public double salary;
	
	public JobRole() {
		System.out.println("no-arg constructor in JobRole");
	}

	public void designation() {
		System.out.println("Invoking designation in JobRole");
	}
}
