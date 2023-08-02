package com.xworkz.Inheritance;

public class Fruit extends Flower{
	public String name;
	
	public Fruit() {
		System.out.println("no-arg constructor in Fruit");
	}
	
	public void fruitInfo() {
		System.out.println("Invoking fruitInfo in Fruit");
	}

}
