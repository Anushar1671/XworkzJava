package com.xworkz.Abstraction.implementation;

import com.xworkz.Abstraction.rule.PassportVerification;

public class Passport implements PassportVerification {

	@Override
	public void verifyCitizen() {
		System.out.println("Invoking verification in Passport");

	}

}
