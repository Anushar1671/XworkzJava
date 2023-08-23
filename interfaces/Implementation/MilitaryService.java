package com.xworkz.app.interfaces.Implementation;

import com.xworkz.app.interfaces.Military;

public class MilitaryService implements Military {

	@Override
	public void name() {
		System.out.println("Invoking name in MilitaryService");

	}

	@Override
	public int age(int experience) {
		System.out.println("Invoking age in MilitaryService");
		return 0;
	}

	@Override
	public String location(String state) {
		System.out.println("Invoking location in MilitaryService");
		return null;
	}

}
