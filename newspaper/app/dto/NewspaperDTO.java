package com.xworkz.newspaper.app.dto;

import java.io.Serializable;

public class NewspaperDTO implements Serializable {
	private String lang;
	private int noOfPages;
	private double price;
	private String publisher;

	public NewspaperDTO() {

	}

	public NewspaperDTO(String lang, int noOfPages, double price, String publisher) {
		super();
		this.lang = lang;
		this.noOfPages = noOfPages;
		this.price = price;
		this.publisher = publisher;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public int getnoOfPages() {
		return noOfPages;
	}

	public void setnoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "NewspaperDTO [lang=" + lang + ", noOfPages=" + noOfPages + ", price=" + price + ", " + "publisher="
				+ publisher + "]";
	}

}
