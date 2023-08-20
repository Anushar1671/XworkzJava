package com.xworkz.app.equals;

public class EqualsRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in EqualsRunner");
		Minister minister = new Minister("D K Shivakumar", "Congress", 20, "Degree", "Banglore", 50);
		Minister minister1 = new Minister("D K Shivakumar", "BJP", 25, "Degree", "Mysore", 60);
		boolean same = minister.equals(minister1);
		System.out.println(same);
		System.out.println("---------------------------------");
		CEO ceo = new CEO("Xworkz", 14, "Omkar", 15, "Banglore", 35);
		CEO ceo1 = new CEO("Xworkz", 14, "Omkaromakar", 15, "Banglore", 35);
		boolean same1 = ceo.equals(ceo1);
		System.out.println(same1);
		System.out.println("---------------------------------");
		Sniper sniper = new Sniper("Abhi", 35, "rifle", "Observation", "SharpShooter", "Dehli");
		Sniper sniper1 = new Sniper("Abhi", 35, "rifle", "Observation", "SharpShooter", "Dehli");
		boolean same2 = sniper.equals(sniper1);
		System.out.println(same2);
		System.out.println("---------------------------------");
		Mechanic mechanic = new Mechanic("Rahul", 30, 9654785123l, "Shimoga", "Mechanic shop", "cleaning");
		Mechanic mechanic1 = new Mechanic("Rahul", 30, 9654785656l, "Shimoga", "Mechanic service", "cleaning");
		boolean same3 = mechanic.equals(mechanic1);
		System.out.println(same3);
		System.out.println("---------------------------------");
		Cook cook = new Cook(35, "likith", 10, 4243433422l, "Mysore", true);
		Cook cook1 = new Cook(35, "likith", 10, 965478422l, "Mysore", true);
		boolean same4 = cook.equals(cook1);
		System.out.println(same4);
		System.out.println("---------------------------------");
		Thief thief = new Thief("Raghu", 45, "Hasan", "gold", "temple", false);
		Thief thief1 = new Thief("Raghu", 45, "Hasan", "gold", "temple", false);
		boolean same5 = thief.equals(thief1);
		System.out.println(same5);
	}

}
