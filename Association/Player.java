package com.xworkz.Association;

public class Player {
	public Building building;
	public String playerName;
	public String experience;
	public HomeTown homeTown;
	
	public Player(Building building,String playerName,String experience,HomeTown town) {
		this.building=building;
		this.playerName=playerName;
		this.experience=experience;
		this.homeTown=homeTown;
	}

	public Player(Building[] building2, String playerName2, String experience2, HomeTown homeTown2) {
		// TODO Auto-generated constructor stub
	}

	public void printInfo() {
		System.out.println("Invoking printinfo in Player");
		System.out.println("Building name :"+building);
		System.out.println("Player name :"+playerName);
		System.out.println("Player experience :"+experience);
		System.out.println("Home Town :"+homeTown);
		//building.printInfo();
		//homeTown.printInfo();
		
		
	}	
	}


