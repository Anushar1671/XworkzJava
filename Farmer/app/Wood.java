package com.xworkz.Farmer.app;

public class Wood {
	private String name;
	private Paper paper;

	public Wood(String name) {
		this.name = name;

	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}

	public void color() {
		System.out.println("Invoking color in Wood");
		this.paper.size();
	}

}
