package com.xworkz.Association;

public class Area {
	public String areaName;
	public Corporate corporate;
	
	public Area(String areaName,Corporate corporate) {
		this.areaName=areaName;
		this.corporate=corporate;
	}

	public void printInfo() {
		System.out.println("Invoking printInfo in Area");
		System.out.println("Area name :"+areaName);
		System.out.println("Corporate :"+corporate);
		corporate.printInfo();
	}

}
