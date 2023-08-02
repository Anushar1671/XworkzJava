package com.xworkz.Inheritance;

public class FatherRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in FatherRunner");
		Family family=new Family();
		Family family1=new GreatGrandFather();
		Family family2=new GrandFather();
		Family family3=new Father();
		Family family4=new Son();
		Family family5=new GrandSon();
		Family family6=new GreatGrandSon();
		family.familyInfo();
		System.out.println(family.name);
		
		GreatGrandFather greatGrandFather=new GreatGrandFather();
		GreatGrandFather greatGrandFather1=new GrandFather();
		GreatGrandFather greatGrandFather2=new Father();
		GreatGrandFather greatGrandFather3=new Son();
		GreatGrandFather greatGrandFather4=new GrandSon();
		GreatGrandFather greatGrandFather5=new GreatGrandSon();
		greatGrandFather.greatGrandFatherInfo();
		System.out.println(greatGrandFather.age);
		
		GrandFather grandFather=new GrandFather();
		GrandFather grandFather1=new Father();
		GrandFather grandFather2=new Son();
		GrandFather grandFather3=new GrandSon();
		GrandFather grandFather4=new GreatGrandSon();
		grandFather.grandFatherInfo();
		System.out.println(grandFather.name);
		
		Father father=new Father();
		Father father1=new Son();
		Father father2=new GrandSon();
		Father father3=new GreatGrandSon();
		father.familyInfo();
		System.out.println(family.name);
		
		Son son=new Son();
		Son son1=new GrandSon();
		Son son2=new GreatGrandSon();
		son.sonInfo();
		System.out.println(son.age);
		
		GrandSon grandSon=new GrandSon();
		GrandSon grandSon1=new GreatGrandSon();
		grandSon.grandSonInfo();
		System.out.println(grandSon.work);
		
		GreatGrandSon greatgrandSon=new GreatGrandSon();
		greatgrandSon.info();
		System.out.println(greatgrandSon.name);
		
	}

}
