package com.xworkz.Farmer.boot;

import com.xworkz.Farmer.app.Button;
import com.xworkz.Farmer.app.Shirt;

public class ShirtRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in ShirtRunner");
		Shirt shirt = new Shirt("Black");
		Button button = new Button();
		shirt.setButton(button);
		shirt.size();
	}

}
