package com.xworkz.app.object;

public class Pendant {
	private String material;
	private String shape;
	private double price;
	private String shopName;
	private String color;
	private String shopLocation;
	private int size;
	private boolean gemStone;
	private boolean engraving;
	private String theme;
	private boolean matchingSet;
	private boolean message;

	public Pendant() {
		System.out.println("Invoking constructor in Pendant");

	}

	public Pendant(String material, String shape, double price, String shopName, String color, String shopLocation,
			int size, boolean gemStone, boolean engraving, String theme, boolean matchingSet, boolean message) {
		super();
		this.material = material;
		this.shape = shape;
		this.price = price;
		this.shopName = shopName;
		this.color = color;
		this.shopLocation = shopLocation;
		this.size = size;
		this.gemStone = gemStone;
		this.engraving = engraving;
		this.theme = theme;
		this.matchingSet = matchingSet;
		this.message = message;
	}

	@Override
	public String toString() {
		return "material=" + material + ", shape=" + shape + ", price=" + price + ", shopName=" + shopName + ", color="
				+ color + ", shopLocation=" + shopLocation + ", size=" + size + ", gemStone=" + gemStone
				+ ", engraving=" + engraving + ", theme=" + theme + ", matchingSet=" + matchingSet + ", message="
				+ message + "";
	}

}
