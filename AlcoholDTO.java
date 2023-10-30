package com.xworkz.app.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class AlcoholDTO implements Serializable {

	private int id;
	private String alcoholName;
	private double cost;
	private float quantity;
	private boolean goodQuality;
	private long gstNumber;
	private float gstRate;
	private boolean toxic;
	private LocalDate manufactureDate;
	private LocalDateTime expiryDate;

	public AlcoholDTO() {
		super();
	}

	public AlcoholDTO(int id, String alcoholName, double cost, float quantity, boolean goodQuality, long gstNumber,
			float gstRate, boolean toxic, LocalDate manufactureDate, LocalDateTime expiryDate) {
		super();
		this.id = id;
		this.alcoholName = alcoholName;
		this.cost = cost;
		this.quantity = quantity;
		this.goodQuality = goodQuality;
		this.gstNumber = gstNumber;
		this.gstRate = gstRate;
		this.toxic = toxic;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlcoholName() {
		return alcoholName;
	}

	public void setAlcoholName(String alcoholName) {
		this.alcoholName = alcoholName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public boolean isGoodQuality() {
		return goodQuality;
	}

	public void setGoodQuality(boolean goodQuality) {
		this.goodQuality = goodQuality;
	}

	public long getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(long gstNumber) {
		this.gstNumber = gstNumber;
	}

	public float getGstRate() {
		return gstRate;
	}

	public void setGstRate(float gstRate) {
		this.gstRate = gstRate;
	}

	public boolean isToxic() {
		return toxic;
	}

	public void setToxic(boolean toxic) {
		this.toxic = toxic;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public LocalDateTime getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDateTime expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlcoholDTO other = (AlcoholDTO) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (expiryDate == null) {
			if (other.expiryDate != null)
				return false;
		} else if (!expiryDate.equals(other.expiryDate))
			return false;
		if (goodQuality != other.goodQuality)
			return false;
		if (gstNumber != other.gstNumber)
			return false;
		if (Float.floatToIntBits(gstRate) != Float.floatToIntBits(other.gstRate))
			return false;
		if (id != other.id)
			return false;
		if (manufactureDate == null) {
			if (other.manufactureDate != null)
				return false;
		} else if (!manufactureDate.equals(other.manufactureDate))
			return false;
		if (alcoholName == null) {
			if (other.alcoholName != null)
				return false;
		} else if (!alcoholName.equals(other.alcoholName))
			return false;
		if (Float.floatToIntBits(quantity) != Float.floatToIntBits(other.quantity))
			return false;
		if (toxic != other.toxic)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AlcoholDTO [id=" + id + ", alcoholName=" + alcoholName + ", cost=" + cost + ", quantity=" + quantity
				+ ", goodQuality=" + goodQuality + ", gstNumber=" + gstNumber + ", gstRate=" + gstRate + ", toxic="
				+ toxic + ", manufactureDate=" + manufactureDate + ", expiryDate=" + expiryDate + "]";
	}

}
