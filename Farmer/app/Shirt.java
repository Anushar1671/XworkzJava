package com.xworkz.Farmer.app;

public class Shirt {
	private String color;
	private Button button;

	public Shirt(String color) {
		this.color = color;
	}

	public void setButton(Button button) {
		this.button = button;
	}

	public void size() {
		System.out.println("Invoking size in Shirt");
		this.button.price();
	}

}
