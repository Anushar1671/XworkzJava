package com.xworkz.poc.servlet.dto;

import java.io.Serializable;

public class PocDTO implements Serializable{
	private String userId;
	private String password;
	private String street;
	private String city;
	private String stat;
	private String country;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStat() {
		return stat;
	}
	public void setStat(String stat) {
		this.stat = stat;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public PocDTO() {
		super();
	}
	public PocDTO(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	public PocDTO(String street, String city, String stat, String country) {
		super();
		this.street = street;
		this.city = city;
		this.stat = stat;
		this.country = country;
	}
	
	
	

}
