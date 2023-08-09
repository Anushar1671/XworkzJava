package com.xworkz.Polymorphism;

public class Theater {
	public void movie() {
		System.out.println("Invoking no-arg in movie");
	}

	public void movie(String name) {
		System.out.println("Invoking String in movie");
	}

	public void movie(String name, int noOfTicket) {
		System.out.println("Invoking String,int in movie");
	}

	public void movie(String name, int noOfTicket, double price) {
		System.out.println("Invoking String,int,double in movie");
	}

	public void movie(String name, int noOfTicket, double price, float rating) {
		System.out.println("Invoking String,int,double,float in movie");
	}

	public void movie(String name, int noOfTicket, double price, float rating, String address) {
		System.out.println("Invoking String,int,double,float,String in movie");
	}

}
