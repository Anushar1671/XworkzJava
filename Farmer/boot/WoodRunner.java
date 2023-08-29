package com.xworkz.Farmer.boot;

import com.xworkz.Farmer.app.Paper;
import com.xworkz.Farmer.app.Wood;

public class WoodRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in WoodRunner");
		Wood wood = new Wood("Sandal");
		Paper paper = new Paper();
		wood.setPaper(paper);
		wood.color();

	}

}
