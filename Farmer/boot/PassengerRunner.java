package com.xworkz.Farmer.boot;

import com.xworkz.Farmer.app.Bus;
import com.xworkz.Farmer.app.Passenger;

public class PassengerRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in PassengerRunner");
		Passenger passenger = new Passenger(20);
		Bus bus = new Bus();
		passenger.setBus(bus);
		passenger.busNo();
	}

}
