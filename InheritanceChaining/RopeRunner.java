package com.xworkz.InheritanceChaining;

public class RopeRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in RopeRunner");
		Rope rope=new Rope("nylon",1000,200,"strand");
		System.out.println(rope.material);
		System.out.println(rope.cost);
		System.out.println(rope.length);
		System.out.println(rope.otherName);
		System.out.println("-----------------");
		Thread thread=new Thread();
		System.out.println(thread.material);
		System.out.println(thread.cost);
		System.out.println(thread.length);
		System.out.println(thread.otherName);
		System.out.println("-----------------");
		Thread thread1=new Thread("Heap",2000,300,"thread");
		System.out.println(thread1.material);
		System.out.println(thread1.cost);
		System.out.println(thread1.length);
		System.out.println(thread1.otherName);
	}
	
}
