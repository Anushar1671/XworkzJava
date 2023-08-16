package com.xworkz.app.object;

public class Karchief {
	private String color;
	private String clothType;
	private boolean design;
	private double price;
	private int lenght;
	private int width;
	private boolean multipleColor;

	public Karchief() {
		System.out.println("Invoking constructor in Karchief");
	}

	public Karchief(String color, String clothType, boolean design, double price, int lenght, int width,
			boolean multipleColor) {
		super();
		this.color = color;
		this.clothType = clothType;
		this.design = design;
		this.price = price;
		this.lenght = lenght;
		this.width = width;
		this.multipleColor = multipleColor;
	}

	@Override
	public String toString() {
		return "color=" + color + ", clothType=" + clothType + ", design=" + design + ", price=" + price + ", lenght="
				+ lenght + ", width=" + width + ", multipleColor=" + multipleColor + "";
	}

}
