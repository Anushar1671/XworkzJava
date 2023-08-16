package com.xworkz.app.object;

public class Flag {
	private String country;
	private String color;
	private double cost;

	public Flag() {
		System.out.println("Invoking constructor in Flag");
	}

	public Flag(String country, String color, double cost) {
		super();
		this.country = country;
		this.color = color;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "country=" + country + ", color=" + color + ", cost=" + cost + "";
	}

}
