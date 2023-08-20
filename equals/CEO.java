package com.xworkz.app.equals;

public class CEO {
	private String orgName;
	private int since;
	private String name;
	private int experience;
	private String location;
	private int age;

	public CEO() {
		System.out.println("no-arg constructor in CEO");
	}

	public CEO(String orgName, int since, String name, int experience, String location, int age) {
		super();
		this.orgName = orgName;
		this.since = since;
		this.name = name;
		this.experience = experience;
		this.location = location;
		this.age = age;
	}

	@Override
	public String toString() {
		return "CEO [orgName=" + orgName + ", since=" + since + ", name=" + name + ", experience=" + experience
				+ ", location=" + location + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoking equals in CEO");
		if (obj != null) {
			System.out.println("object is not null");

		}
		if (obj instanceof CEO) {
			System.out.println("object is CEO");
		}
		CEO casted = (CEO) obj;
		if (casted.orgName.equals(orgName) && casted.location.equals(location)) {
			System.out.println("orgName and location are same");
			return true;
		} else {
			System.err.println("orgName and location are not same");
		}
		return super.equals(obj);
	}

}
