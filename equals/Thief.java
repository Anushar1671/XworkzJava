package com.xworkz.app.equals;

public class Thief {
	private String name;
	private int age;
	private String address;
	private String target;
	private String destination;
	private boolean caught;

	public Thief() {
		System.out.println("no-arg constructor in Theif");
	}

	public Thief(String name, int age, String address, String target, String destination, boolean caught) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.target = target;
		this.destination = destination;
		this.caught = caught;
	}

	@Override
	public String toString() {
		return "Thief [name=" + name + ", age=" + age + ", address=" + address + ", target=" + target + ", destination="
				+ destination + ", caught=" + caught + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoking equals in Thief");
		if (obj != null) {
			System.out.println("object is not null");

		}
		if (obj instanceof Thief) {
			System.out.println("object is Thief");
		}
		Thief casted = (Thief) obj;
		if (casted.target.equals(target) && casted.destination.equals(destination)) {
			System.out.println("target and destination are same");
			return true;
		} else {
			System.err.println("target and destination are not same");
		}
		return super.equals(obj);
	}

}
