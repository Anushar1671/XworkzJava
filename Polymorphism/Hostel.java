package com.xworkz.Polymorphism;

public class Hostel {
	public void stay() {
		System.out.println("Invoking no-arg in stay");
	}

	public void stay(String name) {
		System.out.println("Invoking String in stay");
	}

	public void stay(String name, double fees) {
		System.out.println("Invoking String,double in stay");
	}

	public void stay(String name, double fees, int since) {
		System.out.println("Invoking String,double,int in stay");
	}

	public void stay(String name, double fees, int since, boolean good) {
		System.out.println("Invoking String,double,int,boolean in stay");
	}

	public void stay(String name, double fees, int since, boolean good, int noOfStudents) {
		System.out.println("Invoking String,double,int,boolean,int in stay");
	}

}
