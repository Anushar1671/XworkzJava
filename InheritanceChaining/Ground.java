package com.xworkz.InheritanceChaining;

public class Ground {
	public String name;
	public int length;
	public double rent;
	public String player;
	
	public Ground(String name,int length,double rent,String player) {
		this.name=name;
		this.length=length;
		this.rent=rent;
		this.player=player;
		System.out.println("Invoking String,int,double,String constructor in Ground");
	}

}
