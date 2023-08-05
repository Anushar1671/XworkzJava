package com.xworkz.InheritanceChaining;

public class CricketGround extends Ground{
	public CricketGround() {
		this("Nehru ground",500,10000,"Rahul");
		System.out.println("no-arg constructor in CricketGround");
	}

	public CricketGround(String name,int length,double rent,String player) {
		super(name,length,rent,player);
		System.out.println("String,int,double,String constructor in CricketGround");
	}
}
