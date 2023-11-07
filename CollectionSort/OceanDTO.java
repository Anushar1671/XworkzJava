package com.xworkz.app.dto;

public class OceanDTO implements Comparable<OceanDTO> {
	private String name;
	private float waterSurface;
	private int area;
	private float depth;

	public OceanDTO() {
		super();
	}

	public OceanDTO(String name, float waterSurface, int area, float depth) {
		super();
		this.name = name;
		this.waterSurface = waterSurface;
		this.area = area;
		this.depth = depth;
	}

	@Override
	public String toString() {
		return "OceanDTO [name=" + name + ", waterSurface=" + waterSurface + ", area=" + area + ", depth=" + depth
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OceanDTO other = (OceanDTO) obj;
		if (area != other.area)
			return false;
		if (Float.floatToIntBits(depth) != Float.floatToIntBits(other.depth))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(waterSurface) != Float.floatToIntBits(other.waterSurface))
			return false;
		return true;
	}

	@Override
	public int compareTo(OceanDTO arg) {
		OceanDTO current = this;
		return current.name.compareTo(arg.name);

	}

}
