package com.xworkz.Association;

public class Lift {
	public int liftNumber;
	
	public Lift(int liftNumber) {
		this.liftNumber=liftNumber;
	}

	public void printInfo() {
		System.out.println("Invoking printInfo in Lift");
		System.out.println("Lift number :"+liftNumber);
	}

}
