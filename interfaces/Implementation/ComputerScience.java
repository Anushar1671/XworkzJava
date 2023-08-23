package com.xworkz.app.interfaces.Implementation;

import com.xworkz.app.interfaces.Engineering;

public class ComputerScience implements Engineering {

	@Override
	public void attendance() {
		System.out.println("Invoking attendance in ComputerScience");

	}

	@Override
	public int since(int year) {
		System.out.println("Invoking since in ComputerScience");
		return 2019;
	}

	@Override
	public boolean regular(String course) {
		System.out.println("Invoking regular in ComputerScience");
		return true;
	}

}
