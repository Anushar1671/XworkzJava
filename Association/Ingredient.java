package com.xworkz.Association;

public class Ingredient {
	public String ingredientName;
	public int quantity;
	public double cost;
	
	public Ingredient(String ingredientName,int quantity,double cost)
	{
		this.ingredientName=ingredientName;
		this.quantity=quantity;
		this.cost=cost;
	}
	
	public void printInfo()
	{
		System.out.println("Invoking printInfo in Ingredient");
		System.out.println("Ingredient name :"+this.ingredientName);
		System.out.println("Quatity :"+this.quantity);
		System.out.println("Cost :"+this.cost);
	}

}
