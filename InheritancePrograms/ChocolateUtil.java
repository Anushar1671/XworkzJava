package com.xworkz.InheritancePrograms;

public class ChocolateUtil {
	public static void brand(Chocolate chocolate) {
		chocolate.brand();
		System.out.println(chocolate.name);
		if(chocolate instanceof DarkChocolate) {
			System.out.println("chocolate is DarkChocolate");
			DarkChocolate darkChocolate=new DarkChocolate();
			System.out.println(darkChocolate.price);
			darkChocolate.quantity();
		}
		
		
		if(chocolate instanceof CaramelChocolate) {
			System.out.println("chocolate is CaramelChocolate");
			CaramelChocolate caramelChocolate=new CaramelChocolate();
			System.out.println(caramelChocolate.quality);
		    caramelChocolate.ingredient();
		}
	}
	

}
