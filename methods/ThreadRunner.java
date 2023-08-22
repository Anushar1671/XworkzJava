package com.xworkz.app.methods;

public class ThreadRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in ThreadRunner");
		Thread thread = new Thread();
		System.out.println(thread.getId());
		System.out.println(thread.getName());
		System.out.println(thread.hashCode());
		System.out.println(thread.isInterrupted());
		System.out.println(thread.getPriority());

	}

}
