package com.xworkz.Overloading;

public class Mouse {
	public void movement() {
		System.out.println("Invoking movement in Mouse");
		movement(3);
		movement(true);
	}
	public void movement(int buttons) {
		System.out.println("Invoking int in movement");
		System.out.println("Number of buttons "+buttons);
	}
	
	public void movement(boolean working) {
		System.out.println("Invoking boolean in movement");
		System.out.println("Mouse is working "+working);
	}
	
	public void movement(int buttons,boolean working) {
		System.out.println("Invoking int,double movement");
		movement(buttons);
		movement(working);
	}

}
