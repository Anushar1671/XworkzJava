package com.xworkz.app.object;

import java.util.stream.IntStream;

public class StringRunner {
	public static void main(String[] args) {
		System.out.println("Instance method");
		String string = new String("Anusha");
		int ref = string.codePointAt(0);
		System.out.println(ref);
		int ref1 = string.compareTo("Aishu");
		System.out.println(ref1);
		String name = "Aishu";
		String ref2 = string.concat(name);
		System.out.println(ref2);
		boolean ref3 = name.endsWith("a");
		System.out.println(ref3);
		boolean ref4 = name.contentEquals(string);
		System.out.println(ref4);
		System.out.println("Static method");
		String ref5 = String.valueOf(name);
		System.out.println(ref5);
		String ref6 = name.format(string, args);
		System.out.println(ref6);
		String ref7 = string.valueOf(ref1);
		System.out.println(ref7);
		String ref8 = name.valueOf("B");
		System.out.println(ref8);
		String ref9 = String.valueOf("abhi");
		System.out.println(ref9);

	}

}
