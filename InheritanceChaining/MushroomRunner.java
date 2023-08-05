package com.xworkz.InheritanceChaining;

public class MushroomRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in MushroomRunner");
		Mushroom mushroom=new Mushroom("Black", 600, 12, true);
		System.out.println(mushroom.color);
		System.out.println(mushroom.price);
		System.out.println(mushroom.quantity);
		System.out.println(mushroom.quality);
		System.out.println("-----------------");
		PoisonMushroom poisonMushroom=new PoisonMushroom();
		System.out.println(poisonMushroom.color);
		System.out.println(poisonMushroom.price);
		System.out.println(poisonMushroom.quantity);
		System.out.println(poisonMushroom.quality);
		System.out.println("-----------------");
		PoisonMushroom poisonMushroom1=new PoisonMushroom("White",1000,20,true);
		System.out.println(poisonMushroom1.color);
		System.out.println(poisonMushroom1.price);
		System.out.println(poisonMushroom1.quantity);
		System.out.println(poisonMushroom1.quality);
	}

}
