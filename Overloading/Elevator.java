package com.xworkz.Overloading;

public class Elevator {
	public void move() {
		System.out.println("Invoking move in Elevator");
		move("transport");
		move(500);
	}
	public void move(String use) {
		System.out.println("Invoking String in move");
		System.out.println("Use of elevator "+use);
	}
	
	public void move(float speed) {
		System.out.println("Invoking float in move");
		System.out.println("Speed of elevator "+speed);
	}
	
	public void move(String use,float speed) {
		System.out.println("Invoking String,float move");
		move(use);
		move(speed);
	}

}
