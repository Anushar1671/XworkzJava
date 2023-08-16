package com.xworkz.app.object;

public class Runner {
	public static void main(String[] args) {
		System.out.println("Invoking main in Runner");

		Logo logo = new Logo();
		System.out.println(logo);
		Logo logo1 = new Logo("X-workz", "Orange", "Square", 5, 5);
		System.out.println(logo1);
		Logo logo2 = new Logo("PESITM", "Blue", "Round", 5, 5);
		System.out.println(logo2);
		System.out.println("---------------------------------------------");
		Karchief karchief = new Karchief();
		System.out.println(karchief);
		Karchief karchief1 = new Karchief("White", "Cotton", true, 50, 15, 15, true);
		System.out.println(karchief1);
		Karchief karchief2 = new Karchief("Blue", "Cotton", false, 40, 20, 20, false);
		System.out.println(karchief2);
		System.out.println("---------------------------------------------");
		Flag flag = new Flag();
		System.out.println(flag);
		Flag flag1 = new Flag("India", "safron,white,blue,green", 250);
		System.out.println(flag1);
		Flag flag2 = new Flag("America", "white", 200);
		System.out.println(flag2);
		System.out.println("---------------------------------------------");
		Cave cave = new Cave();
		System.out.println(cave);
		Cave cave1 = new Cave("Sahyadri Range", true, "Yana", "Sun Light", "Rock", "Black", true, "Yes", true, true);
		System.out.println(cave1);
		Cave cave2 = new Cave("Near Banglore", true, "Antharagange", "yes", "Rock", "Brown", true, "Yes", true, true);
		System.out.println(cave2);
		System.out.println("---------------------------------------------");
		Pendant pendant = new Pendant();
		System.out.println(pendant);
		Pendant pendant1 = new Pendant("Metal", "Round", 500, "SJR", "Silver", "RajajiNagar", 20, false, true, "God",
				false, true);
		System.out.println(pendant1);
		Pendant pendant2 = new Pendant("Gold", "Leaf", 500, "Joyalukkas", "Golden", "Majestic", 10, true, true,
				"Flower", true, true);
		System.out.println(pendant2);
	}

}
