package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class City {

	public static void main(String[] args) {
		Collection<String> city=new ArrayList();
		city.add("Banglore");
		city.add("Manglore");
		city.add("Mysore");
		city.add("Davangere");
		city.add("Chikkamagaluru");
		city.add("Shimoga");
		city.add("Bhadravathi");
		city.add("Davanagere");
		city.add("Udupi");
		city.add("Tumkur");
		city.add("Tiptur");
		city.add("Birur");
		city.add("Arasikere");
		city.add("Hassan");
		city.add("Sagar");
		city.add("Shikaripura");
		city.add("Ballari");
		city.add("Mumabi");
		city.add("Kolkatha");
		city.add("Dehli");
		Iterator<String> itr=city.iterator();
		while(itr.hasNext()) {
			String value=itr.next();
			System.out.println("City names : "+value);
		}
		

	}

}
