package com.xworkz.Association;

public class Corporate {
	public Building[] building;
	public String CorporateName;
	
	public Corporate(Building[] building,String name) {
		this.building=building;
		this.CorporateName=CorporateName;
	}
	
	public void printInfo() {
		System.out.println("Invoking printInfo in Corporate");
		for(int index=0;index<this.building.length;index++) {
			Building ref2=this.building[index];
			ref2.printInfo();
		}
	}

}
