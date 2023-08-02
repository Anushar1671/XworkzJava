package com.xworkz.Inheritance;

public class Tab extends Laptop{
	public String storage;
	
	public Tab() {
		System.out.println("no-arg constructor in Laptop");
	}

	public void tabInfo() {
		System.out.println("Invoking tabInfo in Tab");
	}
}
