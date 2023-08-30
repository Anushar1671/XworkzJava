package com.xworkz.Abstraction.implementation;

import com.xworkz.Abstraction.rule.Education;

public class College implements Education {

	@Override
	public void knowledge() {
		System.out.println("Invoking knowledge in College");

	}

}
