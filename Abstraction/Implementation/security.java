package com.xworkz.Abstraction.implementation;

import com.xworkz.Abstraction.rule.PassportVerification;

public class security implements PassportVerification {

	@Override
	public void verifyCitizen() {
		System.out.println("Invoking verifyCitizen in security");

	}

}
