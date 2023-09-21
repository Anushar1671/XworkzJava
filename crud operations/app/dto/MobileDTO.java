package com.xworkz.crud.app.dto;

import java.io.Serializable;

public class MobileDTO implements Serializable {
	private String brand;
	private String color;
	private double price;
	private String shopName;
	private int storage;
	private boolean goodCamera;
	private String userName;
	private boolean fingerLock;
	private int noOfApps;
	private String location;

	public MobileDTO() {

	}

	public MobileDTO(String brand, String color, double price, String shopName, int storage, boolean goodCamera,
			String userName, boolean fingerLock, int noOfApps, String location) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.shopName = shopName;
		this.storage = storage;
		this.goodCamera = goodCamera;
		this.userName = userName;
		this.fingerLock = fingerLock;
		this.noOfApps = noOfApps;
		this.location = location;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public boolean isGoodCamera() {
		return goodCamera;
	}

	public void setGoodCamera(boolean goodCamera) {
		this.goodCamera = goodCamera;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean isFingerLock() {
		return fingerLock;
	}

	public void setFingerLock(boolean fingerLock) {
		this.fingerLock = fingerLock;
	}

	public int getNoOfApps() {
		return noOfApps;
	}

	public void setNoOfApps(int noOfApps) {
		this.noOfApps = noOfApps;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "MobileDTO [brand=" + brand + ", color=" + color + ", price=" + price + ", shopName=" + shopName
				+ ", storage=" + storage + ", goodCamera=" + goodCamera + ", userName=" + userName + ", fingerLock="
				+ fingerLock + ", noOfApps=" + noOfApps + ", location=" + location + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof MobileDTO) {
				System.out.println("Object is MobileDTO");
			}
			MobileDTO casted = (MobileDTO) obj;
			if (casted.equals(brand) && casted.equals(color) && casted.equals(location) && casted.equals(shopName)
					&& casted.equals(userName) && casted.price == price && casted.noOfApps == noOfApps
					&& casted.storage == storage) {
				System.out.println("Instance is same");
				return true;
			} else {
				System.out.println("Instance is not same");
				return false;
			}
		}
		return super.equals(obj);
	}

}
