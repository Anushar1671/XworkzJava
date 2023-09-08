package com.xworkz.newspaper.app.dto;

public class PrinterDTO {
	private String brand;
	private String color;
	private double price;
	private String type;

	public PrinterDTO() {
		super();
	}

	public PrinterDTO(String brand, String color, double price, String type) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "PrinterDTO [brand=" + brand + ", color=" + color + ", price=" + price + ", type=" + type + "]";
	}

}
