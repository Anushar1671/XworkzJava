package com.xworkz.InheritancePrograms;

public class ChocolateRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in ChocolateRunner");
		System.out.println("----------------------");
		Chocolate chocolate=new Chocolate();
		DarkChocolate darkChocolate=new DarkChocolate();
		CaramelChocolate caramelChocolate=new CaramelChocolate();
		ChocolateUtil.brand(chocolate);
		System.out.println("----------------------");
		ChocolateUtil.brand(darkChocolate);
		System.out.println("----------------------");
		ChocolateUtil.brand(caramelChocolate);
	}

}
