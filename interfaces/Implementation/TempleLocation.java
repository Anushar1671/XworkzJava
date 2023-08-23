package com.xworkz.app.interfaces.Implementation;

import com.xworkz.app.interfaces.Temple;

public class TempleLocation implements Temple {

	@Override
	public void name() {
		System.out.println("Invoking name in Templelocation");

	}

	@Override
	public String dress(boolean dressCode) {
		System.out.println("Invoking dress in Templelocation");
		return "Ethnic";
	}

	@Override
	public int entry(int fee) {
		System.out.println("Invoking entry in Templelocation");
		return 100;
	}

}
