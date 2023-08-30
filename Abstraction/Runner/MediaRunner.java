package com.xworkz.Abstraction.Runner;

import com.xworkz.Abstraction.implementation.SocialMedia;
import com.xworkz.Abstraction.implementation.WhatsApp;
import com.xworkz.Abstraction.rule.Media;

public class MediaRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in MediaRunner");
		Media media = new WhatsApp();
		SocialMedia socialMedia = new SocialMedia();
		socialMedia.setMedia(media);
		socialMedia.connection();
	}

}
