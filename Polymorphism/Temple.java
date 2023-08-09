package com.xworkz.Polymorphism;

public class Temple {
	public void prayer() {
		System.out.println("Invoking no-arg in prayer");
	}

	public void prayer(String god) {
		System.out.println("Invoking String in prayer");
	}

	public void prayer(String god, int openTime) {
		System.out.println("Invoking String,int in prayer");
	}

	public void prayer(String god, int openTime, String location) {
		System.out.println("Invoking String,int,String in prayer");
	}

	public void prayer(String god, int openTime, String location, int closeTime) {
		System.out.println("Invoking String,int,String,int in prayer");
	}

	public void prayer(String god, int openTime, String location, int closeTime, boolean entry) {
		System.out.println("Invoking String,int,String,int,boolean in prayer");
	}

}
