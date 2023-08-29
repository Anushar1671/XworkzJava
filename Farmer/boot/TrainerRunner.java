package com.xworkz.Farmer.boot;

import com.xworkz.Farmer.app.Laptop;
import com.xworkz.Farmer.app.Trainer;

public class TrainerRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in TrainerRunner");
		Trainer trainer = new Trainer("Omkar");
		Laptop laptop = new Laptop();
		trainer.setLaptop(laptop);
		trainer.storage();
	}

}
