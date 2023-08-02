package com.xworkz.Inheritance;

public class Job extends Ceo{
	public String role;
	
	public Job() {
		System.out.println("no-arg constructor in Job");
	}
	
	public void jobInfo() {
		System.out.println("Invoking jobInfo in Job");
	}
}
