package com.xworkz.Override;

public class HomeTheater extends Theater{
	@Override
	public void movie() {
		System.out.println("HomeTheater overrides Theater");
		super.movie();
	}

}
