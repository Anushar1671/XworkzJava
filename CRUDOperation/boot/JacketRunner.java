package com.xworkz.CRUDOperation.boot;

import com.xworkz.CRUDOperation.app.repository.JacketRepositoryImpl;
import com.xworkz.CRUDOperation.app.repository.JacketRepsitory;

public class JacketRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in JacketRunner");
		JacketRepsitory jacketRepsitory = new JacketRepositoryImpl();
		jacketRepsitory.color("Black");
		jacketRepsitory.color("White");
		jacketRepsitory.color("Gray");
		jacketRepsitory.color("Brown");
		jacketRepsitory.color("Blue");
		jacketRepsitory.color("Green");
		jacketRepsitory.color("Yellow");
		jacketRepsitory.color("Orange");
		jacketRepsitory.color("Silver");
		jacketRepsitory.color("Red");

	}

}
