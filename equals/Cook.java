package com.xworkz.app.equals;

public class Cook {
	private int age;
	private String name;
	private int experience;
	private long contact;
	private String address;
	private boolean foodTast;

	public Cook() {
		System.out.println("no-arg constructor in Cook");
	}

	@Override
	public String toString() {
		return "Cook [age=" + age + ", name=" + name + ", experience=" + experience + ", contact=" + contact
				+ ", address=" + address + ", foodTast=" + foodTast + "]";
	}

	public Cook(int age, String name, int experience, long contact, String address, boolean foodTast) {
		super();
		this.age = age;
		this.name = name;
		this.experience = experience;
		this.contact = contact;
		this.address = address;
		this.foodTast = foodTast;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoking equals in Cook");
		if (obj != null) {
			System.out.println("object is not null");

		}
		if (obj instanceof Cook) {
			System.out.println("object is Cook");
		}
		Cook casted = (Cook) obj;
		Cook currentInstance = this;
		if (casted.name.equals(name) && casted.address.equals(address)) {
			System.out.println("name and address are same");
			return true;
		} else {
			System.err.println("name and address are not same");
		}
		return super.equals(obj);
	}

}
