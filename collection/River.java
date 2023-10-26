package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class River {

	public static void main(String[] args) {
		Collection<String> river = new ArrayList();
		river.add("Kaveri");
		river.add("Ganga");
		river.add("Tunga");
		river.add("Bhadra");
		river.add("sharavathi");		
		System.out.println("Total rivers : " + river.size());
		
		System.out.println("------add-------");
		Iterator<String> itr = river.iterator();
		while (itr.hasNext()) {
			String value = itr.next();
			System.out.println("River is : " + value);
		}
		System.out.println("------remove-------");
		river.remove("Ganga");
		Iterator<String> itr2 = river.iterator();
		while (itr2.hasNext()) {
			String value2 = itr2.next();
			System.out.println("River is : " + value2);
		}
		System.out.println("------addAll-------");
		river.addAll(river);
		Iterator<String> itr1 = river.iterator();
		while (itr1.hasNext()) {
			String value1 = itr1.next();
			System.out.println("River is : " + value1);
		}
		
		System.out.println("------contains-------");
		boolean ref=river.contains("Ganga");
		System.out.println(ref);
		Iterator<String> itr3 = river.iterator();
		
		System.out.println("-------containsAll------");
		river.containsAll(river);
		Iterator<String> itr4 = river.iterator();
		while (itr4.hasNext()) {
			
			String value4 = itr4.next();
			System.out.println("River is : " + value4);
		}
		System.out.println("-----removeAll--------");
		river.removeAll(river);
		Iterator<String> itr5= river.iterator();
		while (itr5.hasNext()) {
			String value5 = itr5.next();
			System.out.println("River is : " + value5);
		}
		System.out.println("-----clear--------");
		river.clear();
		Iterator<String> itr6= river.iterator();
		while (itr6.hasNext()) {
			String value6 = itr6.next();
			System.out.println("River is : " + value6);
		}
		System.out.println("-------isEmpty------");
		river.isEmpty();
		Iterator<String> itr7= river.iterator();
		while (itr7.hasNext()) {// hasNext is to check whether the element is there or not
			String value7 = itr7.next();// next is to get the value present in the list
			System.out.println("River is : " + value7);
		}
	}

}
//access for each,for each method,iterator,stream
//hasNext is to check whether the element is there or not
//next is to get the value present in the list