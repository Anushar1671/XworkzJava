package com.xworkz.app.equals;

public class Minister {
	private String name;
	private String partyName;
	private int experience;
	private String education;
	private String address;
	private int age;

	public Minister() {
		System.out.println("no-arg constructor");
	}

	public Minister(String name, String partyName, int experience, String education, String address, int age) {
		super();
		this.name = name;
		this.partyName = partyName;
		this.experience = experience;
		this.education = education;
		this.address = address;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Minister [name=" + name + ", partyName=" + partyName + ", experience=" + experience + ", education="
				+ education + ", address=" + address + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoking equals in Minister");
		if (obj != null) {
			System.out.println("object is not null");

		}
		if (obj instanceof Minister) {
			System.out.println("object is Minister");
		}
		Minister casted = (Minister) obj;
		if (casted.name.equals(name)) {
			System.out.println("Minister name is same");
			return true;
		} else {
			System.err.println("Minister name is not same");

		}

		return super.equals(obj);
	}

}
