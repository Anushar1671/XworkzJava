package com.xworkz.app.dto;

public class RobotDTO implements Comparable<RobotDTO> {
	private String robotName;
	private double price;
	private boolean unique;
	private String use;

	public RobotDTO() {
		super();
	}

	public RobotDTO(String robotName, double price, boolean unique, String use) {
		super();
		this.robotName = robotName;
		this.price = price;
		this.unique = unique;
		this.use = use;
	}

	@Override
	public String toString() {
		return "RobotDTO [robotName=" + robotName + ", price=" + price + ", unique=" + unique + ", use=" + use + "]";
	}

	public String getRobotName() {
		return robotName;
	}

	public void setRobotName(String robotName) {
		this.robotName = robotName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isUnique() {
		return unique;
	}

	public void setUnique(boolean unique) {
		this.unique = unique;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RobotDTO other = (RobotDTO) obj;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (robotName == null) {
			if (other.robotName != null)
				return false;
		} else if (!robotName.equals(other.robotName))
			return false;
		if (unique != other.unique)
			return false;
		if (use == null) {
			if (other.use != null)
				return false;
		} else if (!use.equals(other.use))
			return false;
		return true;
	}

	@Override
	public int compareTo(RobotDTO arg) {
		RobotDTO current = this;
		if (current.price == arg.price) {
			return 0;
		}
		if (current.price < arg.price) {
			return 10;
		}
		if (current.price > arg.price) {
			return -1;
		}

		return 0;
	}

}
