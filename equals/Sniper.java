package com.xworkz.app.equals;

public class Sniper {
	private String name;
	private int age;
	private String weapon;
	private String tactics;
	private String otherName;
	private String location;

	public Sniper() {
		System.out.println("no-arg constructor in Sniper");
	}

	public Sniper(String name, int age, String weapon, String tactics, String otherName, String location) {
		super();
		this.name = name;
		this.age = age;
		this.weapon = weapon;
		this.tactics = tactics;
		this.otherName = otherName;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Sniper [name=" + name + ", age=" + age + ", weapon=" + weapon + ", tactics=" + tactics + ", otherName="
				+ otherName + ", location=" + location + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoking equals in Sniper");
		if (obj != null) {
			System.out.println("object is not null");

		}
		if (obj instanceof CEO) {
			System.out.println("object is Sniper");
		}
		Sniper casted = (Sniper) obj;
		if (casted.name.equals(name) && casted.location.equals(location)) {
			System.out.println("name and location are same");
			return true;
		} else {
			System.err.println("name and location are not same");
		}
		return super.equals(obj);
	}

}
