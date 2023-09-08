package com.xworkz.newspaper.app.dto;

public class AadharDTO {
	private String name;
	private long number;
	private String citizen;
	private int pincode;

	public AadharDTO() {
		super();
	}

	public AadharDTO(String name, long number, String citizen, int pincode) {
		super();
		this.name = name;
		this.number = number;
		this.citizen = citizen;
		this.pincode = pincode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getCitizen() {
		return citizen;
	}

	public void setCitizen(String citizen) {
		this.citizen = citizen;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "AadharDTO [name=" + name + ", number=" + number + ", citizen=" + citizen + ", pincode=" + pincode + "]";
	}

}
