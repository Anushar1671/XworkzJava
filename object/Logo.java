package com.xworkz.app.object;

public class Logo {
	private String name;
	private String color;
	private String shape;
	private int lenght;
	private int width;

	public Logo() {
		System.out.println("Invoking constructor in Cave");
	}

	public Logo(String name, String color, String shape, int lenght, int width) {
		super();
		this.name = name;
		this.color = color;
		this.shape = shape;
		this.lenght = lenght;
		this.width = width;
	}

	@Override
	public String toString() {
		return "name=" + name + ", color=" + color + ", shape=" + shape + ", lenght=" + lenght + ", width=" + width
				+ "";
	}

}
