package com.xworkz.Inheritance;

public class Founder extends Company{
	public String founderName;
	
	public Founder() {
		System.out.println("no-arg constructor in Founder");
	}
	
	public void founderInfo() {
		System.out.println("Invoking founderInfo in Founder");
	}
}
