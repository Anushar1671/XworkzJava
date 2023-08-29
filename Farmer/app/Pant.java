package com.xworkz.Farmer.app;

public class Pant {
	private int size;
	private Zip zip;

	public Pant(int size) {
		this.size = size;
	}

	public void setZip(Zip zip) {
		this.zip = zip;
	}

	public void color() {
		System.out.println("Invoking color in Pant");
		this.zip.material();
	}

}
