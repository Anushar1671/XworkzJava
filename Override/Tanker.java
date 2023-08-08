package com.xworkz.Override;

public class Tanker extends Drum{
	@Override
	public void hold() {
		System.out.println("Tanker overrides Drum");
		super.hold();
	}
}
