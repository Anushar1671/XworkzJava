package com.xworkz.Abstraction.implementation;

import com.xworkz.Abstraction.rule.PassportVerification;

public class Custom {
	PassportVerification verification;

	public void verifyCitizen() {
		System.out.println("Invoking verifyCitizen in Custom");
		this.verification.verifyCitizen();

	}

	public void setPassportVerification(PassportVerification verification) {
		this.verification = verification;
	}

}
