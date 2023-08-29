package com.xworkz.Farmer.app;

public class LapTop1 {
	private String brand;
	private Processor processor;

	public LapTop1() {
		this.brand = brand;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public void ram() {
		System.out.println("Invoking ram in LapTops");
	}

	public void color() {
		System.out.println("Invoking color in LapTops");
	}

	public void storage() {
		System.out.println("Invoking storage in LapTops");
	}

	public void price() {
		System.out.println("Invoking pricef in LapTops");
		this.processor.version();
		this.processor.type();
		this.processor.use();
		this.processor.cost();
	}

}
