package com.xworkz.app.object;

import com.xworkz.app.java.LocalDateTime;

public class LocalDateTimeRunner {
	public static void main(String[] args) {
		LocalDateTime localDateTime = new LocalDateTime();
		boolean ref = localDateTime.equals(localDateTime);
		System.out.println(ref);
		int ref1 = localDateTime.hashCode();
		System.out.println(ref1);
		String ref2 = localDateTime.toString();
		System.out.println(ref2);
	}

}
