package com.xworkz.app.dto;

import java.time.LocalDate;

public class ProductDTO implements Comparable<ProductDTO> {
	private int id, quantity, modelNo, serialNo;
	private String name, company, discription, packer, included, genericName, asin, countryOfOrigin, primeDelivery;
	private float rating, peopleRated, peopleRatedFive, peopleRatedFour, peopleRatedThree, peopleRatedTwo,
			peopleRatedOne;
	private double price, discount, itemWeight, warranty;
	private boolean damaged, returnable;
	private LocalDate manfDate, expiryDate, dateFirstAvailable, deliveryExpectedDate, returnBy;

	public ProductDTO() {
		super();
	}

	public ProductDTO(int id, int quantity, int modelNo, int serialNo, String name, String company, String discription,
			String packer, String included, String genericName, String asin, String countryOfOrigin,
			String primeDelivery, float rating, float peopleRated, float peopleRatedFive, float peopleRatedFour,
			float peopleRatedThree, float peopleRatedTwo, float peopleRatedOne, double price, double discount,
			double itemWeight, double warranty, boolean damaged, boolean returnable, LocalDate manfDate,
			LocalDate expiryDate, LocalDate dateFirstAvailable, LocalDate deliveryExpectedDate, LocalDate returnBy) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.modelNo = modelNo;
		this.serialNo = serialNo;
		this.name = name;
		this.company = company;
		this.discription = discription;
		this.packer = packer;
		this.included = included;
		this.genericName = genericName;
		this.asin = asin;
		this.countryOfOrigin = countryOfOrigin;
		this.primeDelivery = primeDelivery;
		this.rating = rating;
		this.peopleRated = peopleRated;
		this.peopleRatedFive = peopleRatedFive;
		this.peopleRatedFour = peopleRatedFour;
		this.peopleRatedThree = peopleRatedThree;
		this.peopleRatedTwo = peopleRatedTwo;
		this.peopleRatedOne = peopleRatedOne;
		this.price = price;
		this.discount = discount;
		this.itemWeight = itemWeight;
		this.warranty = warranty;
		this.damaged = damaged;
		this.returnable = returnable;
		this.manfDate = manfDate;
		this.expiryDate = expiryDate;
		this.dateFirstAvailable = dateFirstAvailable;
		this.deliveryExpectedDate = deliveryExpectedDate;
		this.returnBy = returnBy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getPacker() {
		return packer;
	}

	public void setPacker(String packer) {
		this.packer = packer;
	}

	public String getIncluded() {
		return included;
	}

	public void setIncluded(String included) {
		this.included = included;
	}

	public String getGenericName() {
		return genericName;
	}

	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}

	public String getAsin() {
		return asin;
	}

	public void setAsin(String asin) {
		this.asin = asin;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getPrimeDelivery() {
		return primeDelivery;
	}

	public void setPrimeDelivery(String primeDelivery) {
		this.primeDelivery = primeDelivery;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public float getPeopleRated() {
		return peopleRated;
	}

	public void setPeopleRated(float peopleRated) {
		this.peopleRated = peopleRated;
	}

	public float getPeopleRatedFive() {
		return peopleRatedFive;
	}

	public void setPeopleRatedFive(float peopleRatedFive) {
		this.peopleRatedFive = peopleRatedFive;
	}

	public float getPeopleRatedFour() {
		return peopleRatedFour;
	}

	public void setPeopleRatedFour(float peopleRatedFour) {
		this.peopleRatedFour = peopleRatedFour;
	}

	public float getPeopleRatedThree() {
		return peopleRatedThree;
	}

	public void setPeopleRatedThree(float peopleRatedThree) {
		this.peopleRatedThree = peopleRatedThree;
	}

	public float getPeopleRatedTwo() {
		return peopleRatedTwo;
	}

	public void setPeopleRatedTwo(float peopleRatedTwo) {
		this.peopleRatedTwo = peopleRatedTwo;
	}

	public float getPeopleRatedOne() {
		return peopleRatedOne;
	}

	public void setPeopleRatedOne(float peopleRatedOne) {
		this.peopleRatedOne = peopleRatedOne;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getItemWeight() {
		return itemWeight;
	}

	public void setItemWeight(double itemWeight) {
		this.itemWeight = itemWeight;
	}

	public double getWarranty() {
		return warranty;
	}

	public void setWarranty(double warranty) {
		this.warranty = warranty;
	}

	public boolean isDamaged() {
		return damaged;
	}

	public void setDamaged(boolean damaged) {
		this.damaged = damaged;
	}

	public boolean isReturnable() {
		return returnable;
	}

	public void setReturnable(boolean returnable) {
		this.returnable = returnable;
	}

	public LocalDate getManfDate() {
		return manfDate;
	}

	public void setManfDate(LocalDate manfDate) {
		this.manfDate = manfDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public LocalDate getDateFirstAvailable() {
		return dateFirstAvailable;
	}

	public void setDateFirstAvailable(LocalDate dateFirstAvailable) {
		this.dateFirstAvailable = dateFirstAvailable;
	}

	public LocalDate getDeliveryExpectedDate() {
		return deliveryExpectedDate;
	}

	public void setDeliveryExpectedDate(LocalDate deliveryExpectedDate) {
		this.deliveryExpectedDate = deliveryExpectedDate;
	}

	public LocalDate getReturnBy() {
		return returnBy;
	}

	public void setReturnBy(LocalDate returnBy) {
		this.returnBy = returnBy;
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", quantity=" + quantity + ", modelNo=" + modelNo + ", serialNo=" + serialNo
				+ ", name=" + name + ", company=" + company + ", discription=" + discription + ", packer=" + packer
				+ ", included=" + included + ", genericName=" + genericName + ", asin=" + asin + ", countryOfOrigin="
				+ countryOfOrigin + ", primeDelivery=" + primeDelivery + ", rating=" + rating + ", peopleRated="
				+ peopleRated + ", peopleRatedFive=" + peopleRatedFive + ", peopleRatedFour=" + peopleRatedFour
				+ ", peopleRatedThree=" + peopleRatedThree + ", peopleRatedTwo=" + peopleRatedTwo + ", peopleRatedOne="
				+ peopleRatedOne + ", price=" + price + ", discount=" + discount + ", itemWeight=" + itemWeight
				+ ", warranty=" + warranty + ", damaged=" + damaged + ", returnable=" + returnable + ", manfDate="
				+ manfDate + ", expiryDate=" + expiryDate + ", dateFirstAvailable=" + dateFirstAvailable
				+ ", deliveryExpectedDate=" + deliveryExpectedDate + ", returnBy=" + returnBy + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDTO other = (ProductDTO) obj;
		if (asin == null) {
			if (other.asin != null)
				return false;
		} else if (!asin.equals(other.asin))
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (countryOfOrigin == null) {
			if (other.countryOfOrigin != null)
				return false;
		} else if (!countryOfOrigin.equals(other.countryOfOrigin))
			return false;
		if (damaged != other.damaged)
			return false;
		if (dateFirstAvailable == null) {
			if (other.dateFirstAvailable != null)
				return false;
		} else if (!dateFirstAvailable.equals(other.dateFirstAvailable))
			return false;
		if (deliveryExpectedDate == null) {
			if (other.deliveryExpectedDate != null)
				return false;
		} else if (!deliveryExpectedDate.equals(other.deliveryExpectedDate))
			return false;
		if (Double.doubleToLongBits(discount) != Double.doubleToLongBits(other.discount))
			return false;
		if (discription == null) {
			if (other.discription != null)
				return false;
		} else if (!discription.equals(other.discription))
			return false;
		if (expiryDate == null) {
			if (other.expiryDate != null)
				return false;
		} else if (!expiryDate.equals(other.expiryDate))
			return false;
		if (genericName == null) {
			if (other.genericName != null)
				return false;
		} else if (!genericName.equals(other.genericName))
			return false;
		if (id != other.id)
			return false;
		if (included == null) {
			if (other.included != null)
				return false;
		} else if (!included.equals(other.included))
			return false;
		if (Double.doubleToLongBits(itemWeight) != Double.doubleToLongBits(other.itemWeight))
			return false;
		if (manfDate == null) {
			if (other.manfDate != null)
				return false;
		} else if (!manfDate.equals(other.manfDate))
			return false;
		if (modelNo != other.modelNo)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (packer == null) {
			if (other.packer != null)
				return false;
		} else if (!packer.equals(other.packer))
			return false;
		if (Float.floatToIntBits(peopleRated) != Float.floatToIntBits(other.peopleRated))
			return false;
		if (Float.floatToIntBits(peopleRatedFive) != Float.floatToIntBits(other.peopleRatedFive))
			return false;
		if (Float.floatToIntBits(peopleRatedFour) != Float.floatToIntBits(other.peopleRatedFour))
			return false;
		if (Float.floatToIntBits(peopleRatedOne) != Float.floatToIntBits(other.peopleRatedOne))
			return false;
		if (Float.floatToIntBits(peopleRatedThree) != Float.floatToIntBits(other.peopleRatedThree))
			return false;
		if (Float.floatToIntBits(peopleRatedTwo) != Float.floatToIntBits(other.peopleRatedTwo))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (primeDelivery == null) {
			if (other.primeDelivery != null)
				return false;
		} else if (!primeDelivery.equals(other.primeDelivery))
			return false;
		if (quantity != other.quantity)
			return false;
		if (Float.floatToIntBits(rating) != Float.floatToIntBits(other.rating))
			return false;
		if (returnBy == null) {
			if (other.returnBy != null)
				return false;
		} else if (!returnBy.equals(other.returnBy))
			return false;
		if (returnable != other.returnable)
			return false;
		if (serialNo != other.serialNo)
			return false;
		if (Double.doubleToLongBits(warranty) != Double.doubleToLongBits(other.warranty))
			return false;
		return true;
	}

	@Override
	public int compareTo(ProductDTO arg) {
		return this.name.compareTo(arg.name);
	}

}
