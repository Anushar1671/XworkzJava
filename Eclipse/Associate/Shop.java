package com.xworkz.Associate;

public class Shop {
	public Salesman salesman;
	public void name() {
		System.out.println("Invoking name in Shop");
		if(this.salesman!=null) {
			this.salesman.age();
		}
		else {
			System.err.println("salesman is null cannot invoke method name");
		}
	}
	public void address() {
		System.out.println("Invoking address in Shop");
		if(this.salesman!=null) {
			this.salesman.experience();
		}
		else {
			System.err.println("salesman is null cannot invoke method address");
		}
	}

}
