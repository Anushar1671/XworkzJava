package com.xworkz.InheritanceChaining;

public class GroundRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in GroundRunner");
		Ground ground=new Ground("Ram Mandir",200,15000,"Rohit");
		System.out.println(ground.name);
		System.out.println(ground.length);
		System.out.println(ground.rent);
		System.out.println(ground.player);
		System.out.println("-----------------");
		CricketGround cricketGround=new CricketGround();
		System.out.println(cricketGround.name);
		System.out.println(cricketGround.length);
		System.out.println(cricketGround.rent);
		System.out.println(cricketGround.player);
		System.out.println("-----------------");
		CricketGround cricketGround1=new CricketGround("Kuvempu",250,25000,"thread");
		System.out.println(cricketGround1.name);
		System.out.println(cricketGround1.length);
		System.out.println(cricketGround1.rent);
		System.out.println(cricketGround1.player);
	}
	
}



