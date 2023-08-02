package com.xworkz.Inheritance;

public class BirdRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in BirdRunner");
		Bird bird=new Bird();
		Bird bird1=new Egg();
		Bird bird2=new Chick();
		Bird bird3=new Parrot();
		bird.birdInfo();
		System.out.println(bird.name);
		Egg egg=new Egg();
		Egg egg1=new Chick();
		Egg egg2=new Parrot();
		egg.eggInfo();
		System.out.println(egg.Shape);
		Chick chick=new Chick();
		Chick chick1=new Parrot();
		chick.chickInfo();
		System.out.println(chick.color);
		Parrot parrot=new Parrot();
		parrot.parrotInfo();
		System.out.println(parrot.name);
	}
}
