package com.xworkz.InheritancePrograms;

public class ZooRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in ZooRunner");
		Zoo zoo=new Zoo();
		StateZoo stateZoo=new StateZoo();
		NationalZoo nationalZoo=new NationalZoo();
		ZooUtil.since(zoo);
		System.out.println("----------------------");
		ZooUtil.since(stateZoo);
		System.out.println("----------------------");
		ZooUtil.since(nationalZoo);
	}

}
