package com.xworkz.InheritancePrograms;

public class ZooUtil {
	public static void since(Zoo zoo) {
		zoo.location();
		System.out.println(zoo.name);
		
	if(zoo instanceof StateZoo) {
		System.out.println("Zoo is StateZoo");
		StateZoo stateZoo=new StateZoo();
		stateZoo.address();
		System.out.println(stateZoo.entryFee);
	}
	if(zoo instanceof NationalZoo) {
		System.out.println("Zoo is NationalZoo");
		NationalZoo nationalZoo=new NationalZoo();
		nationalZoo.name();
		System.out.println(nationalZoo.pincode);
	}
	}

}
