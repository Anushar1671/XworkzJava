package com.xworkz.Farmer.boot;

import com.xworkz.Farmer.app.LapTop1;
import com.xworkz.Farmer.app.Processor;

public class LapTopRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in LapTopRunner");
		LapTop1 lapTop = new LapTop1();
		Processor processor = new Processor();
		lapTop.setProcessor(processor);
		lapTop.color();
		lapTop.ram();
		lapTop.storage();
		lapTop.price();
	}

}
