package com.xworkz.app.object;

public class IntegerRunner {
	public static void main(String[] args) {
		Integer integer = new Integer(1);
		System.out.println("Instance method");
		int ref = integer.intValue();
		System.out.println(ref);
		int number = 5000;
		int ref1 = integer.compareTo(number);
		System.out.println(ref1);
		int ref2 = integer.byteValue();
		System.out.println(ref2);
		int ref3 = (int) integer.doubleValue();
		System.out.println(ref3);
		int ref4 = integer.intValue();
		System.out.println(ref4);
		System.out.println("Static method");
		String ref5 = Integer.toHexString(number);
		System.out.println(ref5);
		int ref6 = integer.min(ref4, number);
		System.out.println(ref6);
		int ref7 = integer.max(ref4, number);
		System.out.println(ref7);
		int ref8 = integer.hashCode(number);
		System.out.println(ref8);
		int ref9 = (int) Integer.toUnsignedLong(ref);
		System.out.println(ref9);

	}

}
