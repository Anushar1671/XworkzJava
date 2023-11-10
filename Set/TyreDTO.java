package com.xworkz.app.dto;

import java.io.Serializable;

public class TyreDTO implements Serializable {
	private String type;
	private double cost;
	private String brand;
	private String vehicle;

	public TyreDTO() {
		super();
	}

	public TyreDTO(String type, double cost, String brand, String vehicle) {
		super();
		this.type = type;
		this.cost = cost;
		this.brand = brand;
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "TyreDTO [type=" + type + ", cost=" + cost + ", brand=" + brand + ", vehicle=" + vehicle + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public int hashCode() {
		System.out.println("Running hashCode in TyreDTO");
		return 200;

	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals " + getType());
		if (obj != null) {
			if (obj instanceof TyreDTO) {
				TyreDTO dto = (TyreDTO) obj;
				if (dto.getType().equals(this.getType()) && dto.getBrand().equals(this.getBrand())
						&& dto.getCost() == this.getCost() && dto.getVehicle().equals(this.getVehicle())) {
					return true;
				}
			}
		}
		return false;
	}
}
