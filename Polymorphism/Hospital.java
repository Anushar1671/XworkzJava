package com.xworkz.Polymorphism;

public class Hospital {
	public void treatment() {
		System.out.println("Invoking no-arg in treatment");
	}

	public void treatment(String name) {
		System.out.println("Invoking String in treatment");
	}

	public void treatment(String name, int noOfDoctors) {
		System.out.println("Invoking String,int in treatment");
	}

	public void treatment(String name, int noOfDoctors, double fees) {
		System.out.println("Invoking String,int,double in treatment");
	}

	public void treatment(String name, int noOfDoctors, double fees, boolean goodService) {
		System.out.println("Invoking String,int,double,boolean in treatment");
	}

	public void treatment(String name, int noOfDoctors, double fees, boolean goodService, String address) {
		System.out.println("Invoking String,int,double,boolean,String in treatment");
	}

}
