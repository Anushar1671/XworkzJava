package com.xworkz.Association;

public class HomeTown {
	public String homeTownName="Dehli";
	public int pinCode;
	public Area[] area;
	
	public HomeTown(String homeTownName,int pinCode,Area[] area) {
		this.homeTownName=homeTownName;
		this.pinCode=pinCode;
		this.area=area;
	}
	
	public void printInfo() {
		System.out.println("Invoking printInfo in HomeTown");
		System.out.println("Home town name :"+homeTownName);
		System.out.println("Pin Code :"+pinCode);
		for(int index=0;index<this.area.length;index++) {
			Area ref1=this.area[index];
			ref1.printInfo();
		}
	}

}
