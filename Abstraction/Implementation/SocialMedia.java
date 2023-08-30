package com.xworkz.Abstraction.implementation;

import com.xworkz.Abstraction.rule.Media;

public class SocialMedia {
	Media media;

	public void connection() {
		System.out.println("Invoking connection in SocialMedia");
		this.media.connection();
	}

	public void setMedia(Media media) {
		System.out.println("Invoking setMedia in SocialMedia");
		this.media=media;
	}

}
