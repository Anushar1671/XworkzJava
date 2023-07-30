package com.xworkz.app;

public class MainRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in MainRunner");
		Minister minister=new Minister();
		int ref=minister.experience;
		String ref1=minister.name;
		System.out.println(ref);
		System.out.println(ref1);
		
		System.out.println("--------------------------");
		Constituency constituency=minister.constituency;
		int ref2=constituency.cno;
		Population ref3=constituency.population;
		System.out.println(ref2);
		System.out.println(ref3);
		
		System.out.println("--------------------------");
		IndiraCanteen indiraCanteen=constituency.indiraCanteen;
		float ref4=indiraCanteen.breakFastPrice;
		Lunchprice ref5=indiraCanteen.lunchPrice;
		System.out.println(ref4);
		System.out.println(ref5);
	}
}

