package com.xworkz.Association;

public class ToothPaste {
	public String name;
	public String brand;
	public String company;
	public Ingredient[] ingredient;
	
	public ToothPaste(String name,String brand,String company,Ingredient[] ingredient) 
	{
		this.name=name;
		this.brand=brand;
		this.company=company;
		this.ingredient=ingredient;
	}
	
	public void printInfo()
	{
		System.out.println("ToothPaste info");
		System.out.println("Tooth Paste name :"+this.name);
		System.out.println("Tooth Paste barnd :"+this.brand);
		System.out.println("Tooth Paste Company :"+this.company);
		for(int index=0;index<this.ingredient.length;index++) {
			Ingredient ref=this.ingredient[index];
			ref.printInfo();
		}
		
		
	}
	
	

}
