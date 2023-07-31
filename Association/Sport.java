package com.xworkz.Association;

public class Sport {
	public String name;
	public Player[] player;
	
	public Sport(String name,Player[] player)
	{
		this.name=name;
		this.player=player;
	}
	
	public void printInfo()
	{
		System.out.println("Invoking printInfo in Sport");
		System.out.println("Player name :"+name);
		for(int index=0;index<this.player.length;index++) {
			Player ref=this.player[index];
			ref.printInfo();
		}
	}

}
