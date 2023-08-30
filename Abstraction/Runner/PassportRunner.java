package com.xworkz.Abstraction.Runner;

import com.xworkz.Abstraction.implementation.Custom;
import com.xworkz.Abstraction.implementation.security;
import com.xworkz.Abstraction.rule.PassportVerification;

public class PassportRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in PassportRunner");
		PassportVerification verification = new security();
		Custom custom = new Custom();
		custom.setPassportVerification(verification);
		custom.verifyCitizen();
	}

}
