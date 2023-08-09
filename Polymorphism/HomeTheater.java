package com.xworkz.Polymorphism;

public class HomeTheater extends Theater {
	@Override
	public void movie() {
		System.out.println("HomeTheater overrides Theater");
		super.movie();
	}

	@Override
	public void movie(String name) {
		super.movie(name);
	}

	@Override
	public void movie(String name, int noOfTicket) {
		super.movie(name, noOfTicket);
	}

	@Override
	public void movie(String name, int noOfTicket, double price) {
		super.movie(name, noOfTicket, price);
	}

	@Override
	public void movie(String name, int noOfTicket, double price, float rating) {
		super.movie(name, noOfTicket, price, rating);
	}

	@Override
	public void movie(String name, int noOfTicket, double price, float rating, String address) {
		super.movie(name, noOfTicket, price, rating, address);
	}
}
