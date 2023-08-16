package com.xworkz.app.object;

public class Cave {
	private String location;
	private boolean trekking;
	private String name;
	private String lightSource;
	private String formation;
	private String color;
	private boolean Echo;
	private String waterResource;
	private boolean history;
	private boolean ancient;

	public Cave() {
		System.out.println("Invoking constructor in Cave");

	}

	public Cave(String location, boolean trekking, String name, String lightSource, String formation, String color,
			boolean echo, String waterResource, boolean history, boolean ancient) {
		super();
		this.location = location;
		this.trekking = trekking;
		this.name = name;
		this.lightSource = lightSource;
		this.formation = formation;
		this.color = color;
		Echo = echo;
		this.waterResource = waterResource;
		this.history = history;
		this.ancient = ancient;
	}

	@Override
	public String toString() {
		return "location=" + location + ", trekking=" + trekking + ", name=" + name + ", lightSource=" + lightSource
				+ ", formation=" + formation + ", color=" + color + ", Echo=" + Echo + ", waterResource="
				+ waterResource + ", history=" + history + ", ancient=" + ancient + "";
	}

}
