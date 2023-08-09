package com.xworkz.Polymorphism;

public class Zoo {
	public void animal() {
		System.out.println("Invoking no-arg in animal");
	}

	public void animal(String name) {
		System.out.println("Invoking String in animal");
	}

	public void animal(String name, boolean protect) {
		System.out.println("Invoking String,boolean in animal");
	}

	public void animal(String name, boolean protect, int number) {
		System.out.println("Invoking String,boolean,int in animal");
	}

	public void animal(String name, boolean protect, int number, boolean healthy) {
		System.out.println("Invoking String,boolean,int,boolean,String in animal");
	}

	public void animal(String name, boolean protect, int number, boolean healthy, String color) {
		System.out.println("Invoking String,boolean,int,boolean,String in animal");
	}

}
