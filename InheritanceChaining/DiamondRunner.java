package com.xworkz.InheritanceChaining;

public class DiamondRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in DiamondRunner");
		Diamond diamond=new Diamond("Solid",250000,"Shimoga",2);
		System.out.println(diamond.state);
		System.out.println(diamond.price);
		System.out.println(diamond.address);
		System.out.println(diamond.weight);
		System.out.println("-----------------");
		Kimberlite kimberlite=new Kimberlite();
		System.out.println(kimberlite.state);
		System.out.println(kimberlite.price);
		System.out.println(kimberlite.address);
		System.out.println(kimberlite.weight);
		System.out.println("-----------------");
		Kimberlite kimberlite1=new Kimberlite("Solid",1000000,"Davanagere",10);
		System.out.println(kimberlite1.state);
		System.out.println(kimberlite1.price);
		System.out.println(kimberlite1.address);
		System.out.println(kimberlite1.weight);
	}

}
