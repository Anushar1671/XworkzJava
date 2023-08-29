package com.xworkz.Farmer.boot;

import com.xworkz.Farmer.app.Pant;
import com.xworkz.Farmer.app.Zip;

public class PantRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main PantRunner");
		Pant pant = new Pant(10);
		Zip zip = new Zip();
		pant.setZip(zip);
		pant.color();

	}

}
