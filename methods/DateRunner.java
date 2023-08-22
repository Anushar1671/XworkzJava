package com.xworkz.app.methods;

import java.util.Date;

public class DateRunner {
	public static void main(String[] args) {
		System.out.println("Invonking main in DateRunner");
		Date date=new Date(2023,8,22);
		Date date1=new Date(2023,7,22);
		System.out.println(date.after(date1));
		System.out.println(date.getDate());
		System.out.println(date.before(date1));
		System.out.println(date1.compareTo(date));
		System.out.println(date1.equals(date));
		System.out.println(date1.getTime());
	}

}
