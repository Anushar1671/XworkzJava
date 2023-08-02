package com.xworkz.Inheritance;

public class Computer extends Device{
	public String name;
	
	public Computer() {
		System.out.println("no-arg constructor in Computer");
	}
	
	public void computerInfo() {
		System.out.println("Invoking computer in Computer");
	}

}
