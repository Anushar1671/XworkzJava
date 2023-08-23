package com.xworkz.app.interfaces;

public interface Metro {
	public abstract void run(String stationName);

	public abstract int speed(int trackWidth);

	public abstract boolean securityCheck();

}
