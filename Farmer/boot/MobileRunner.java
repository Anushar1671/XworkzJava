package com.xworkz.Farmer.boot;

import com.xworkz.Farmer.app.Charger;
import com.xworkz.Farmer.app.Mobile;

public class MobileRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in MobileRunner");
		Mobile mobile = new Mobile();
		Charger charger = new Charger();
		mobile.setCharger(charger);
		mobile.brand();
		mobile.price();
		mobile.storage();
		mobile.color();

	}

}
