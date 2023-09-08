package com.xworkz.newspaper.app.dto;

public class DoctorDTO {
	private String name;
	private int experience;
	private String specialization;
	private int age;

	public DoctorDTO() {
		super();
	}

	public DoctorDTO(String name, int experience, String specialization, int age) {
		super();
		this.name = name;
		this.experience = experience;
		this.specialization = specialization;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "DoctorDTO [name=" + name + ", experience=" + experience + ", specialization=" + specialization
				+ ", age=" + age + "]";
	}

}
