package com.xworkz.app.methods;

import java.time.LocalDate;
import java.util.Date;

public class LocalDateRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in LocalDateRunner");
		LocalDate localDate;
		System.out.println(LocalDate.EPOCH);
		System.out.println(LocalDate.MAX);
		System.out.println(LocalDate.of(2023, 8, 21));
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.ofEpochDay(22));
		
		
	}

}
