package com.xworkz.Polymorphism;

public class Mall {
	public void shop() {
		System.out.println("Invoking no-arg in shop");
	}

	public void shop(String name) {
		System.out.println("Invoking String in shop");
	}

	public void shop(String name, boolean parking) {
		System.out.println("Invoking String,boolean in shop");
	}

	public void shop(String name, boolean parking, int since) {
		System.out.println("Invoking String,boolean,int in shop");
	}

	public void shop(String name, boolean parking, int since, String address) {
		System.out.println("Invoking String,boolean,int,String in shop");
	}

	public void shop(String name, boolean parking, int since, String address, boolean open) {
		System.out.println("Invoking String,boolean,int,String,boolean in shop");
	}

}
