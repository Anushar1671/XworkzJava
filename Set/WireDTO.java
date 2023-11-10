package com.xworkz.app.dto;

import java.io.Serializable;

public class WireDTO implements Serializable {
	private String name;
	private double cost;
	private String use;
	private float length;

	public WireDTO() {
		super();
	}

	public WireDTO(String name, double cost, String use, float length) {
		super();
		this.name = name;
		this.cost = cost;
		this.use = use;
		this.length = length;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "WireDTO [name=" + name + ", cost=" + cost + ", use=" + use + ", length=" + length + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Running HashCode in WireDTO");
		return 100;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals "+getName());
		if (obj != null) {
			if (obj instanceof WireDTO) {
				WireDTO dto = (WireDTO) obj;
				if (dto.getName().equals(this.getName()) && dto.getUse().equals(this.getUse())
						&& dto.getCost() == this.getCost() && dto.getLength() == this.getLength()) {
					return true;
				}
			}
		}
		return false;
	}

}
