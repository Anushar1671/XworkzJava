package com.xworkz.Polymorphism;

public class PoliceStation {
	public void protect() {
		System.out.println("Invoking no-arg in protect");
	}

	public void protect(String name) {
		System.out.println("Invoking String in protect");
	}

	public void protect(String name, int noOfCriminals) {
		System.out.println("Invoking String,int in protect");
	}

	public void protect(String name, int noOfCriminals, String location) {
		System.out.println("Invoking String,int,String in protect");
	}

	public void protect(String name, int noOfCriminals, String location, int noOfPolice) {
		System.out.println("Invoking String,int,String,int in protect");
	}

	public void protect(String name, int noOfCriminals, String location, int noOfPolice, boolean investigation) {
		System.out.println("Invoking String,int,String,int,boolean in protect");
	}

}
