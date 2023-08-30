package com.xworkz.Abstraction.implementation;

import com.xworkz.Abstraction.rule.Internet;

public class Browser {
	private Internet internet;

	public void connect() {
		System.out.println("Invoking connect in Browser");
		this.internet.connect();
	}

	public void setInternet(Internet internet) {
		System.out.println("Invoking setInternet in Browser");
		this.internet =internet;

	}

}
