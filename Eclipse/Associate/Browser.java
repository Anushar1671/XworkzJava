package com.xworkz.Associate;

public class Browser {
	public Internet internet;
	
	public void type() {
		System.out.println("Invoking type in Browser");
		if(this.internet!=null) {
			this.internet.purpose();
		}
		else {
			System.err.println("internet is null cannot invoke method type");
		}
		
	}
	public void cost() {
		System.out.println("Invoking cost in Browser");
		if(this.internet!=null) {
			this.internet.availability();
		}
		else {
			System.err.println("internet is null cannot invoke method cost");
		}
	}
	

}
