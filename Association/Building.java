package com.xworkz.Association;

public class Building {
	public Floor[] floor;
	public Lift[] lift;
	
	public Building(Floor[] floor,Lift[] lift) {
		this.floor=floor;
		this.lift=lift;
	}

	public void printInfo() {
		System.out.println("Invoking printInfo in Building");
		for(int index=0;index<this.floor.length;index++) {
			Floor ref3=this.floor[index];
			ref3.printInfo();
		}
		for(int index=0;index<this.lift.length;index++) {
			Lift ref4=this.lift[index];
			ref4.printInfo();
	}
	}
}

