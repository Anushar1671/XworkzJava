package com.xworkz.Override;

public class MainRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in Main Runner");
		Coal coal=new BestCoal();
		coal.burn();
		System.out.println("------------------------------");
		Amoeba amoeba=new Genus();
		amoeba.survive();
		System.out.println("------------------------------");
		Bangle bangle=new GoldBangle();
		bangle.sound();
		System.out.println("------------------------------");
		Gate gate=new Barrier();
		gate.security();
		System.out.println("------------------------------");
		Dinosaur dinosaur=new Evolution();
		dinosaur.walk();
		System.out.println("------------------------------");
		Flex flex=new Banner();
		flex.display();
		System.out.println("------------------------------");
		Mic mic=new Speaker();
		mic.sound();
		System.out.println("------------------------------");
		Drum drum=new Tanker();
		drum.hold();
		System.out.println("------------------------------");
		Theater theater=new HomeTheater();
		theater.movie();
		System.out.println("------------------------------");
		Ticket ticket=new BusTicket();
		ticket.travel();
	}

}
