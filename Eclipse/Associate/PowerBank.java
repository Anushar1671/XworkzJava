package com.xworkz.Associate;

public class PowerBank {
	public Battery battery;
	
	public void price() {
		System.out.println("Invoking price in PowerBank");
		if(this.battery!=null) {
			this.battery.name();
		}
		else {
			System.err.println("battery is null cannot be invoke method name");
		}
	}
	
	public void brand() {
			System.out.println("Invoking brand in PowerBank");
			if(this.battery!=null) {
				this.battery.capacity();
		}
		else {
			System.err.println("battery is null cannot be invoke method brand");
		}
	}
}
