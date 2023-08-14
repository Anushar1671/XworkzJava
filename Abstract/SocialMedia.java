package com.xworkz.Abstract;

public abstract class SocialMedia {
	public void entertainment() {
		System.out.println("Invoking entertainment in SocialMedia");
	}

	public void video() {
		System.out.println("Invoking video in SocialMedia");
	}

	public void audio() {
		System.out.println("Invoking audio in SocialMedia");
	}

	public void display() {
		System.out.println("Invoking display in SocialMedia");
	}

	public void theme() {
		System.out.println("Invoking theme in SocialMedia");
	}

	public abstract void users();

	public abstract void subscribers();

	public abstract void likes();

	public abstract void dislikes();

	public abstract void trend();

}
