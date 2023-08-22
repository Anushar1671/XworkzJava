package com.xworkz.app.methods;

public class StringRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in StringRunner");
		String string = new String("Chandan");
		String string1 = "Anusha Abhishek";
		String name = "Aishu";
		System.out.println(string.charAt(1));
		System.out.println(string.split("a"));
		System.out.println(string.split("n", 0));
		System.out.println(string.concat(string1));
		System.out.println(string.compareTo(string));
		System.out.println(string1.substring(2, 5));
		System.out.println(string.isEmpty());
		System.out.println(string.length());
		System.out.println(string.startsWith("C"));
		System.out.println(string1.endsWith("A"));
		System.out.println(string.equalsIgnoreCase("anusha"));
		System.out.println(string.equals(name));
		System.out.println(string.toUpperCase());
		System.out.println(string.toLowerCase());
		System.out.println(string.isBlank());
		System.out.println(string.indexOf(string1));
		System.out.println(string.trim());
	}

}
