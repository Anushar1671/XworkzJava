package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.MobileNoRepository;
import com.xworkz.crud.app.repository.MobileNoRepositoryImpl;
import com.xworkz.crud.app.service.MobileNoService;
import com.xworkz.crud.app.service.MobileNoServiceImpl;

public class MobileNoRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in MobileNoRunner");
		MobileNoRepository mobileNoRepository=new MobileNoRepositoryImpl();
		MobileNoService mobileNoService=new MobileNoServiceImpl(mobileNoRepository);
		boolean save=mobileNoService.validateAndStore(7845127845l);
		System.out.println(save);
		mobileNoService.validateAndStore(7845127845l);
		mobileNoService.validateAndStore(78457845l);
		

	}

}
