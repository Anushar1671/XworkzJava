package com.xworkz.Association;

public class Company {
	public String companyName;
	public String ceo;
	public String originCountry;
	
	public Company(String companyName,String ceo,String originCountry)
	{
		this.companyName=companyName;
		this.ceo=ceo;
		this.originCountry=originCountry;
	}
	
	public void printInfo()
	{
		System.out.println("Invoking printInfo in Company");
		System.out.println("Company name :"+this.companyName);
		System.out.println("Company CEO :"+this.ceo);
		System.out.println("Company origin country :"+this.originCountry);
	}

}
