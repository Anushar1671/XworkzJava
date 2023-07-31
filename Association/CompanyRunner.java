package com.xworkz.Association;

public class CompanyRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in ComapanyRunner");
		String name="Colgate sensitive";
		String brand="Colgate";
		String company="Colgate";
		Company company1=new Company("Colgate","Omkar","India");
		Ingredient ingredient1=new Ingredient("Flavor",20,50);
		Ingredient ingredient2=new Ingredient("Silica",30,500);
		Ingredient ingredient3=new Ingredient("Glycerin",25,550);
		Ingredient ingredient4=new Ingredient("Sodium",50,250);
		Ingredient ingredient5=new Ingredient("Salt",10,450);
		Ingredient[] ingredients= {ingredient1,ingredient2,ingredient3,ingredient4,ingredient5};

		ToothPaste toothPaste=new ToothPaste(name,brand,company,ingredients);
		toothPaste.printInfo();
		company1.printInfo();	
	}
}


