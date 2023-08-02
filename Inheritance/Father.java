package com.xworkz.Inheritance;

public class Father extends GrandFather{
	public String fatherName;
	
	public Father() {
		System.out.println("no-arg constructor in Father");
	}
	
	public void fatherInfo() {
		System.out.println("Invoking fatherInfo in Father");
	}

}
