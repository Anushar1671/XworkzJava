package com.xworkz.app.interfaces.Implementation;

import com.xworkz.app.interfaces.Pg;

public class PgLocation implements Pg {

	@Override
	public void pgName(String name) {
		System.out.println("Invoking pgName in PgLocation");

	}

	@Override
	public String address(boolean secure) {
		System.out.println("Invoking address in PgLocation");
		return "SJR";
	}

	@Override
	public int since(int year) {
		System.out.println("Invoking since in PgLocation");
		return 2022;
	}

}
