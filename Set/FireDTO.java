package com.xworkz.app.dto;

import java.io.Serializable;

public class FireDTO implements Serializable{
	private int speed;
	private boolean high;
	private String direction;
	private String fuel;
	public FireDTO() {
		super();
	}
	public FireDTO(int speed, boolean high, String direction, String fuel) {
		super();
		this.speed = speed;
		this.high = high;
		this.direction = direction;
		this.fuel = fuel;
	}
	@Override
	public String toString() {
		return "FireDTO [speed=" + speed + ", high=" + high + ", direction=" + direction + ", fuel=" + fuel + "]";
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isHigh() {
		return high;
	}
	public void setHigh(boolean high) {
		this.high = high;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	@Override
	public int hashCode() {
		System.out.println("Running hashCode in FireRunner");
		return 16;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals "+getFuel());
		if (obj != null) {
			if (obj instanceof FireDTO) {
				FireDTO dto = (FireDTO) obj;
				if (dto.getDirection().equals(this.getDirection()) && dto.getFuel().equals(this.getFuel())
						&& dto.getSpeed() == this.getSpeed()) {
					return true;
				}
			}
		}
		return false;
	}
}
