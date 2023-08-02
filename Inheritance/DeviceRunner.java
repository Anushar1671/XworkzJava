package com.xworkz.Inheritance;

public class DeviceRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in DeviceRunner");
		Device device=new Device();
		Device device1=new Computer();
		Device device2=new DeskTop();
		Device device3=new Laptop();
		Device device4=new Tab();
		device.name();
		System.out.println(device.number);
		Computer computer=new Computer();
		Computer computer1=new DeskTop();
		Computer computer2=new Laptop();
		Computer computer3=new Tab();
		computer.computerInfo();
		System.out.println(computer.name);
		DeskTop desktop=new DeskTop();
		DeskTop desktop1=new Laptop();
		DeskTop desktop2=new Tab();
		desktop.desktopInfo();
		System.out.println(desktop.desktopName);
		Laptop laptop=new Laptop();
		Laptop laptop1=new Laptop();
		laptop.laptopInfo();
		System.out.println(laptop.price);
		Tab tab=new Tab();
		tab.tabInfo();
		System.out.println(tab.storage);	
	}
}
