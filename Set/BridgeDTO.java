package com.xworkz.app.dto;

import java.io.Serializable;

public class BridgeDTO implements Serializable {
	private String name;
	private String location;
	private int constructYear;
	private boolean popular;

	public BridgeDTO() {
		super();
	}

	public BridgeDTO(String name, String location, int constructYear, boolean popular) {
		super();
		this.name = name;
		this.location = location;
		this.constructYear = constructYear;
		this.popular = popular;
	}

	@Override
	public String toString() {
		return "BridgeDTO [name=" + name + ", location=" + location + ", constructYear=" + constructYear + ", popular="
				+ popular + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getConstructYear() {
		return constructYear;
	}

	public void setConstructYear(int constructYear) {
		this.constructYear = constructYear;
	}

	public boolean isPopular() {
		return popular;
	}

	public void setPopular(boolean popular) {
		this.popular = popular;
	}

	@Override
	public int hashCode() {
		System.out.println("Running hashCode in BridgeDTO");
		return 25;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals " + getName());
		if (obj != null) {
			if (obj instanceof BridgeDTO) {
				BridgeDTO dto = (BridgeDTO) obj;
				if (dto.getName().equals(this.getName()) && dto.getLocation().equals(this.getLocation())
						&& dto.getConstructYear() == this.getConstructYear() && dto.isPopular() == this.isPopular()) {
					return true;
				}
			}
		}
		return false;
	}
}
