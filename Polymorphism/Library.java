package com.xworkz.Polymorphism;

public class Library {
	public void read() {
		System.out.println("Invoking no-arg in read");
	}

	public void read(String address) {
		System.out.println("Invoking String in read");
	}

	public void read(String address, boolean open) {
		System.out.println("Invoking String,boolean in read");
	}

	public void read(String address, boolean open, int since) {
		System.out.println("Invoking String,boolean,int in read");
	}

	public void read(String address, boolean open, int since, String bookName) {
		System.out.println("Invoking String,boolean,int,String in read");
	}

	public void read(String address, boolean open, int since, String bookName, int publishYear) {
		System.out.println("Invoking String,boolean,int,String,String in read");
	}

}
