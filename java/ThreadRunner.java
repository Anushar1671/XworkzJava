package com.xworkz.app.object;

public class ThreadRunner {
	public static void main(String[] args) {
		Thread thread=new Thread();
		System.out.println("Instance method");
		boolean ref=thread.isAlive();
		System.out.println(ref);
		int ref1=thread.getPriority();
		System.out.println(ref1);
		long ref2=thread.getId();
		System.out.println(ref2);
		String ref3=thread.getName();
		System.out.println(ref3);
		int ref4=thread.hashCode();
		System.out.println(ref4);
		System.out.println("Static method");
		boolean ref5=thread.interrupted();
		System.out.println(ref5);
		int ref6=thread.activeCount();
		System.out.println(ref6);
		Thread ref7=thread.currentThread();
		System.out.println(ref7);
		boolean ref8=thread.holdsLock(thread);
		System.out.println(ref8);
		boolean ref9=thread.isInterrupted();
		System.out.println(ref9);
		
	}

}
