package com.xworkz.Farmer.app;

public class Passenger {
	private int seatNo;
	private Bus bus;

	public Passenger(int seatNo) {
		this.seatNo = seatNo;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public void busNo() {
		System.out.println("Invoking busNo in Passenger");
		this.bus.color();
	}

}
