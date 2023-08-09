package com.xworkz.Polymorphism;

public class DigitalLibrary extends Library {
	@Override
	public void read() {
		System.out.println("DigitalLibrary overrides Library");
		super.read();
	}

	@Override
	public void read(String address) {
		super.read(address);
	}

	@Override
	public void read(String address, boolean open) {
		super.read(address, open);
	}

	@Override
	public void read(String address, boolean open, int since) {
		super.read(address, open, since);
	}

	@Override
	public void read(String address, boolean open, int since, String bookName) {
		super.read(address, open, since, bookName);
	}

	@Override
	public void read(String address, boolean open, int since, String bookName, int publishYear) {
		super.read(address, open, since, bookName, publishYear);
	}
}
