package com.xworkz.Farmer.boot;

import com.xworkz.Farmer.app.Farmer;
import com.xworkz.Farmer.app.Land;

public class FarmerRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in FarmerRunner");
		String name = "Anusha";
		Land land = new Land();
		Farmer farmer = new Farmer(name);
		farmer.setLand(land);
		farmer.farming();

	}

}
