package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LaptopModel {

	public static void main(String[] args) {
		Collection<String> model=new ArrayList();
		model.add("Acer");
		model.add("Apple MacBook Pro");
		model.add("ALienware");
		model.add("Asus");
		model.add("Avita");
		model.add("Azom");
		model.add("Champion");
		model.add("Corsair");
		model.add("Champion computers");
		model.add("Elitebook");
		model.add("Deeq");
		model.add("Dell");
		model.add("Fujitsu");
		model.add("Gigabyte");
		model.add("HCL");
		model.add("Hisense");
		model.add("Honor");
		model.add("HP");
		model.add("Huawel");
		model.add("Hyundai");
		model.add("iBall");
		model.add("iLife");
		model.add("Infinix");
		model.add("Jio");
		model.add("Jumper");
		model.add("Lava");
		model.add("Lenovo");
		model.add("LG");
		model.add("MarQ");
		model.add("Micromax");
		model.add("Microsoft");
		model.add("MSI");
		model.add("Nokia");
		model.add("Notion Ink");
		model.add("Panasonic");
		model.add("Razer");
		model.add("RDP");
		model.add("Reach");
		model.add("Realme");
		model.add("Redmi");
		model.add("Sager");
		model.add("Samsung");
		model.add("Smartron");
		model.add("Sony");
		model.add("TCL");
		model.add("Tecno");
		model.add("Toshiba");
		model.add("Vaio");
		model.add("Venturer");
		model.add("Xiaomi");
		Iterator<String> itr=model.iterator();
		while(itr.hasNext()) {
			String value=itr.next();
			System.out.println("Laptop Models : "+value);
		}

	}

}
