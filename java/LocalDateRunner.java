package com.xworkz.app.object;

import com.xworkz.app.java.LocalDate;

public class LocalDateRunner {
	public static void main(String[] args) {
		LocalDate localDate = new LocalDate();
		boolean ref = localDate.equals(localDate);
		System.out.println(ref);
		int ref1 = localDate.hashCode();
		System.out.println(ref1);
		String ref2 = localDate.toString();
		System.out.println(ref2);
	}

}
