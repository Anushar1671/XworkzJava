package com.xworkz.Abstraction.implementation;

import com.xworkz.Abstraction.rule.Media;

public class WhatsApp implements Media {

	@Override
	public void connection() {
		System.out.println("Invoking connection in WhatsApp");

	}

}
