package com.xworkz.Inheritance;

public class Parrot extends Chick{
	public String name;
	
	public Parrot() {
		System.out.println("no-arg constructor in Parrot");
	}
	
	public void parrotInfo() {
		System.out.println("Invoking parrotInfo in Parrot");
	}
}
