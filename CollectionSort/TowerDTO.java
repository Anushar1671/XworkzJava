package com.xworkz.app.dto;

public class TowerDTO implements Comparable<TowerDTO> {
	private String name;
	private int height;
	private boolean famous;
	private String location;

	public TowerDTO() {
		super();
	}

	public TowerDTO(String name, int height, boolean famous, String location) {
		super();
		this.name = name;
		this.height = height;
		this.famous = famous;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isFamous() {
		return famous;
	}

	public void setFamous(boolean famous) {
		this.famous = famous;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "RobotDTO [name=" + name + ", height=" + height + ", famous=" + famous + ", location=" + location + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TowerDTO other = (TowerDTO) obj;
		if (famous != other.famous)
			return false;
		if (height != other.height)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(TowerDTO argument) {
		TowerDTO current = this;
		if (current.height == argument.height) {
			return 0;
		}
		if (current.height < argument.height) {
			return 100;
		}
		if (current.height > argument.height) {
			return -1;
		}
		return 0;
	}

}
