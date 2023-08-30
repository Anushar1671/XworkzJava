package com.xworkz.Abstraction.implementation;

import com.xworkz.Abstraction.rule.Internet;

public class FireFox implements Internet {

	@Override
	public void connect() {
		System.out.println("Invoking connect in FireFox");

	}

}
