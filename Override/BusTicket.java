package com.xworkz.Override;

public class BusTicket extends Ticket{
	@Override
	public void travel() {
		System.out.println("BusTicket overrides Ticket");
		super.travel();
	}

}
