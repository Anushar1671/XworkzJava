package com.xworkz.Associate;

public class Hospital {
	public Doctor doctor;
	public Nurse nurse;
	public Patient patient;
	
	public void hospitalName() {
		System.out.println("Invoking hospitalName in Hospital");
		{
		if(this.doctor!=null) {
			this.doctor.specialization();
		}
		else {
			System.err.println("doctor is null cannot invoke method hospitalName");
		}
		}
		
		{
			if(this.nurse!=null) {
				this.nurse.name();
			}
			else {
				System.err.println("name is null cannot invoke method hospitalName");
			}
		}
		
		{
			if(this.patient!=null) {
				this.patient.address();
			}
			else {
				System.err.println("patient is null cannot invoke method hospitalName");
			}
		}
	}
	public void hospitalAddress() {
		System.out.println("Invoking hospitalAddress in Hospital");
		{
		if(this.doctor!=null) {
			this.doctor.experience();
		}
		else {
			System.err.println("doctor is null cannot invoke method hospitalAddress");
		}
		}
		
		{
			if(this.nurse!=null) {
				this.nurse.age();
			}
			else {
				System.err.println("nurse is null cannot invoke method hospitalAddress");
			}
		}
		
		{
			if(this.patient!=null) {
				this.patient.typeOfDisease();
			}
			else {
				System.err.println("patient is null cannot invoke method hospitalAddress");
			}
		}
	}

}
