package com.xworkz.InheritanceChaining;

public class GoldRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in GoldRunner");
		Gold gold=new Gold("Shimoga",55000,"Ring","liquid");
		System.out.println(gold.shopLocation);
		System.out.println(gold.price);
		System.out.println(gold.material);
		System.out.println(gold.state);
		System.out.println("-----------------");
		GoldSmith goldSmith=new GoldSmith();
		System.out.println(goldSmith.shopLocation);
		System.out.println(goldSmith.price);
		System.out.println(goldSmith.material);
		System.out.println(goldSmith.state);
		System.out.println("-----------------");
		GoldSmith goldSmith1=new GoldSmith("Rajaji Nagar",52000,"Ring","Solid");
		System.out.println(goldSmith1.shopLocation);
		System.out.println(goldSmith1.price);
		System.out.println(goldSmith1.material);
		System.out.println(goldSmith1.state);
	}

}
