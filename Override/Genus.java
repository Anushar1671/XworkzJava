package com.xworkz.Override;

public class Genus extends Amoeba{
	@Override
	public void survive() {
		System.out.println("Genus overrides Ameoba");
		super.survive();
	}

}
