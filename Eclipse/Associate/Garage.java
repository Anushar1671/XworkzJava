package com.xworkz.Associate;

public class Garage {
	public Mechanic mechanic;
	public void Wash() {
		System.out.println("Invoking Wash in Garage");
		if(this.mechanic!=null) {
			this.mechanic.Service();
		}
		else {
			System.err.println("mechanic is null cannot invoke method Wash");
		}
		
	}
	public void Address() {
		System.out.println("Invoking Address in Garage");
		if(this.mechanic!=null) {
			this.mechanic.Repair();
		}
		else {
			System.err.println("mechanic is null cannot invoke method Repair");
		}
	}
}
