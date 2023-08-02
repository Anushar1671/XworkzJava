package com.xworkz.Inheritance;

public class Secondary extends Primary{
	public String specification;
	
	public Secondary() {
		System.out.println("no-arg constructor in Secondary");
	}
	
	public void secondaryInfo() {
		System.out.println("Invoking secondaryInfo in Secondary");
	}

}
