package com.xworkz.InheritanceChaining;

public class CoffeeRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in CoffeeRunner");
		Coffee coffee=new Coffee("nescafe",10,false,1);
		System.out.println(coffee.brand);
		System.out.println(coffee.cost);
		System.out.println(coffee.tasty);
		System.out.println(coffee.quantity);
		System.out.println("-----------------");
		ColdCoffee coldCoffee=new ColdCoffee();
		System.out.println(coldCoffee.brand);
		System.out.println(coldCoffee.cost);
		System.out.println(coldCoffee.tasty);
		System.out.println(coldCoffee.quantity);
		System.out.println("-----------------");
		ColdCoffee coldCoffee1=new ColdCoffee("Continental",20,true,1);
		System.out.println(coldCoffee1.brand);
		System.out.println(coldCoffee1.cost);
		System.out.println(coldCoffee1.tasty);
		System.out.println(coldCoffee1.quantity);
	}

}
