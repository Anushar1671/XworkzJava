package com.xworkz.app.interfaces.Implementation;

import com.xworkz.app.interfaces.Metro;

public class MetroTrain implements Metro {

	@Override
	public void run(String stationName) {
		System.out.println("Invoking run in MetroRunner");

	}

	@Override
	public int speed(int trackWidth) {
		System.out.println("Invoking speed in MetroRunner");
		return 50;
	}

	@Override
	public boolean securityCheck() {
		System.out.println("Invoking securityCheck in MetroRunner");
		return true;
	}
}
