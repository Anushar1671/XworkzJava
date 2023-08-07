package com.xworkz.Overloading;

public class Ladder {
	public void climb() {
		System.out.println("Invoking climb in Ladder");
		climb("Extension Ladder");
		climb(15);
	}
	public void climb(String type) {
		System.out.println("Invoking String in climb");
		System.out.println("Type of ladder "+type);
	}
	
	public void climb(int steps) {
		System.out.println("Invoking int in climb");
		System.out.println("Steps in ladder "+steps);
	}
	
	public void climb(String type,int steps) {
		System.out.println("Invoking String,int climb");
		climb(type);
		climb(steps);
	}

}
