package com.xworkz.app.dto;

public class PenDriveDTO implements Comparable<PenDriveDTO> {
	private String capacity;
	private String brand;
	private boolean secure;
	private int speed;

	public PenDriveDTO() {
		super();
	}

	public PenDriveDTO(String capacity, String brand, boolean secure, int speed) {
		super();
		this.capacity = capacity;
		this.brand = brand;
		this.secure = secure;
		this.speed = speed;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isSecure() {
		return secure;
	}

	public void setSecure(boolean secure) {
		this.secure = secure;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "PenDriveDTO [capacity=" + capacity + ", brand=" + brand + ", secure=" + secure + ", speed=" + speed
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
		PenDriveDTO other = (PenDriveDTO) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (capacity == null) {
			if (other.capacity != null)
				return false;
		} else if (!capacity.equals(other.capacity))
			return false;
		if (secure != other.secure)
			return false;
		if (speed != other.speed)
			return false;
		return true;
	}

	@Override
	public int compareTo(PenDriveDTO argument) {
		PenDriveDTO current = this;
		if (current.speed == argument.speed) {
			return 0;
		}
		if (current.speed > argument.speed) {
			return 16;
		}
		if (current.speed < argument.speed) {
			return -10;
		}

		throw new IllegalArgumentException();
	}

}
