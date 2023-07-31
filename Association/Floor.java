package com.xworkz.Association;

public class Floor {
	public String name;
	public int number;
	
	public Floor(String name,int number) {
		this.name=name;
		this.number=number;
	}

	public void printInfo() {
		System.out.println("Invoking printInfo in Floor");
		System.out.println("Floor name :"+name);
		System.out.println("Floor number :"+number);
	}
}
