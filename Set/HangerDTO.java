package com.xworkz.app.dto;

import java.io.Serializable;

public class HangerDTO implements Serializable {
	private String type;
	private String color;
	private double price;
	private boolean goodQuality;

	public HangerDTO() {
		super();
	}

	public HangerDTO(String type, String color, double price, boolean goodQuality) {
		super();
		this.type = type;
		this.color = color;
		this.price = price;
		this.goodQuality = goodQuality;
	}

	@Override
	public String toString() {
		return "HangerDTO [type=" + type + ", color=" + color + ", price=" + price + ", goodQuality=" + goodQuality
				+ "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public boolean isGoodQuality() {
		return goodQuality;
	}

	public void setGoodQuality(boolean goodQuality) {
		this.goodQuality = goodQuality;
	}

	@Override
	public int hashCode() {
		System.out.println("Running hashCode in HangerDTO");
		return 200;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals " + getType());
		if (obj != null) {
			if (obj instanceof HangerDTO) {
				HangerDTO dto = (HangerDTO) obj;
				if (dto.getColor().equals(this.getColor()) && dto.getType().equals(this.getType())
						&& dto.getPrice() == this.getPrice() && dto.isGoodQuality() == this.isGoodQuality()) {
					return true;
				}
			}
		}
		return false;
	}

}
