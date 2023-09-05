package com.xworkz.CRUDOperation.boot;

import com.xworkz.CRUDOperation.app.repository.JacketRepositoryImpl;
import com.xworkz.CRUDOperation.app.repository.JacketRepsitory;
import com.xworkz.CRUDOperation.app.service.JacketService;
import com.xworkz.CRUDOperation.app.service.JacketServiceImpl;

public class JacketServiceRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in JacketServiceRunner");
		JacketRepsitory jacketRepsitory = new JacketRepositoryImpl();
		JacketService jacketService = new JacketServiceImpl(jacketRepsitory);
		jacketService.validateBrand("Puma");
	}

}
