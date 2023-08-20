package com.xworkz.app.equals;

public class Mechanic {
	private String name;
	private int age;
	private long contact;
	private String address;
	private String shopName;
	private String work;
	public Mechanic() {
		System.out.println("no-arg constructor in Mechanic");
	}
	public Mechanic(String name, int age, long contact, String address, String shopName, String work) {
		super();
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.address = address;
		this.shopName = shopName;
		this.work = work;
	}
	@Override
	public String toString() {
		return "Mechanic [name=" + name + ", age=" + age + ", contact=" + contact + ", address=" + address
				+ ", shopName=" + shopName + ", work=" + work + "]";
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoking equals in Mechanic");
		if (obj != null) {
			System.out.println("object is not null");

		}
		if (obj instanceof Mechanic) {
			System.out.println("object is Mechanic");
		}
		Mechanic casted = (Mechanic) obj;
		if (casted.address.equals(address) && casted.work.equals(work)) {
			System.out.println("address and work are same");
			return true;
		} else {
			System.err.println("address and work are not same");
		}
		return super.equals(obj);
	}

}
