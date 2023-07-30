package com.xworkz.Associate;

public class Hotel {
	public Cook cook;
	
	public void location() {
		System.out.println("Invoking location in Hotel");
		if(this.cook!=null) {
			this.cook.experience();
		}
		else {
			System.err.println("cook is null cannot invoke method location");
		}
	}
	public void name() {
		System.out.println("Invoking name in Hotel");
		if(this.cook!=null) {
			this.cook.age();
		}
		else {
			System.err.println("cook is null cannot invoke method age");
		}
	}
	
	

}
