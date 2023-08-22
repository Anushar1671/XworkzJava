package com.xworkz.app.methods;

public class SystemRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in SystemRunner");
		System system;
		String name = "Dell";
		System.out.println(System.currentTimeMillis());
		System.out.println(System.getenv(name));
		System.out.println(System.lineSeparator());
		System.out.println(System.nanoTime());
		System.out.println(System.getProperty(name));
	}

}
