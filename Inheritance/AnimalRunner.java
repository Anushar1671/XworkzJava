package com.xworkz.Inheritance;

public class AnimalRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in AnimalRunner");
		
		Animal animal=new Animal();
		Animal animal1=new Dog();
		Animal animal2=new Pappy();
		animal.walk();
		System.out.println(animal.name);
		Dog dog=new Dog();
		Dog dog1=new Pappy();
		dog.name();
		System.out.println(dog.color);
		Pappy pappy=new Pappy();
		pappy.cute();
		System.out.println(pappy.pappyName);
	}
}
