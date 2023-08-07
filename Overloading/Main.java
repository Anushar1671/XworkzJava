package com.xworkz.Overloading;

public class Main {
	public static void main(String[] args) {
		IronBox ironBox=new IronBox();
		ironBox.temperature();
		ironBox.temperature(2000,true);
		System.out.println("-----------------------------");
		Hotel hotel=new Hotel();
		hotel.service();
		hotel.service("Dosa", 60);
		System.out.println("-----------------------------");
		Specs specs=new Specs();
		specs.lens();
		specs.lens("Concave", 3000);
		System.out.println("-----------------------------");
		Umbrella umbrella=new Umbrella();
		umbrella.protectFromRain();
		umbrella.protectFromRain("White", 8000);
		System.out.println("-----------------------------");
		Stapler stapler=new Stapler();
		stapler.join();
		stapler.join("Metallic", 800);
		System.out.println("-----------------------------");
		Ladder ladder=new Ladder();
		ladder.climb();
		ladder.climb("Straight ladder", 20);
		System.out.println("-----------------------------");
		Gadget gadget=new Gadget();
		gadget.display();
		gadget.display("Laptop", 50000);
		System.out.println("-----------------------------");
		Plier plier=new Plier();
		plier.cutting();
		plier.cutting("Tool", 500);
		System.out.println("-----------------------------");
		Mouse mouse=new Mouse();
		mouse.movement();
		mouse.movement(3, false);
		System.out.println("-----------------------------");
		Elevator elevator=new Elevator();
		elevator.move();
		elevator.move("carry", 250);
	}
}
