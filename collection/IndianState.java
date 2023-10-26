package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IndianState {

	public static void main(String[] args) {
		Collection<String> state = new ArrayList();
		state.add("Bihar");
		state.add("Maharashtra");
		state.add("Chhattisgarh");
		state.add("Goa");
		state.add("Karnataka");
		state.add("Andhra Pradesh");
		state.add("Punjab");
		state.add("West Bengal");
		state.add("Gujarat");
		state.add("Assam");
		state.add("Manipur");
		state.add("Mizoram");
		state.add("Jharkhand");
		state.add("Haryana");
		state.add("Kerala");
		state.add("Himachal Pradesh");
		state.add("Tripura");
		state.add("Arunachal Pradesh");
		state.add("Rajasthan");
		state.add("Nagaland");
		state.add("Odisha");
		state.add("Sikkim");
		state.add("Madhya Pradesh");
		state.add("Tamil Nadu");
		state.add("Uttar Pradesh");
		state.add("Meghalaya");
		state.add("Telangana");
		state.add("Uttarkhand");
		state.add("Delhi");
		state.add("Jammu & Kashmir");
		Iterator<String> itr = state.iterator();
		while (itr.hasNext()) {
			String value = itr.next();
			System.out.println("Indian State names : " + value);
		}

	}

}
