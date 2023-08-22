package com.xworkz.app.methods;

import java.time.LocalDateTime;

public class LocalDateTimeRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in LocalDateTime");
		LocalDateTime localDateTime;
		System.out.println(LocalDateTime.MAX);
		System.out.println(LocalDateTime.MIN);
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.of(2023,8,22,2, 2));
		System.out.println(LocalDateTime.of(2023, 8, 22, 6, 30, 30));
	}

}
