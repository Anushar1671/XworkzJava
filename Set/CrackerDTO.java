package com.xworkz.app.dto;

import java.io.Serializable;

public class CrackerDTO implements Serializable {
	private String name;
	private double price;
	private String manfLocation;
	private String dangerous;

	public CrackerDTO() {
		super();
	}

	public CrackerDTO(String name, double price, String manfLocation, String dangerous) {
		super();
		this.name = name;
		this.price = price;
		this.manfLocation = manfLocation;
		this.dangerous = dangerous;
	}

	@Override
	public String toString() {
		return "CrackerDTO [name=" + name + ", price=" + price + ", manfLocation=" + manfLocation + ", dangerous="
				+ dangerous + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getManfLocation() {
		return manfLocation;
	}

	public void setManfLocation(String manfLocation) {
		this.manfLocation = manfLocation;
	}

	public String getDangerous() {
		return dangerous;
	}

	public void setDangerous(String dangerous) {
		this.dangerous = dangerous;
	}

	@Override
	public int hashCode() {
		System.out.println("Running hashCode in CrackerDTO");
		return 10;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals " + getName());
		if (obj != null) {
			if (obj instanceof CrackerDTO) {
				CrackerDTO dto = (CrackerDTO) obj;
				if (dto.getName().equals(this.getName()) && dto.getManfLocation().equals(this.getManfLocation())
						&& dto.getPrice() == this.getPrice()) {
					return true;
				}
			}
		}
		return false;
	}

}
