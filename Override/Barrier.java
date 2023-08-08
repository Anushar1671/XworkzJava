package com.xworkz.Override;

public class Barrier extends Gate{
	@Override
	public void security() {
		System.out.println("Barrier overrides Gate");
		super.security();
	}

}
