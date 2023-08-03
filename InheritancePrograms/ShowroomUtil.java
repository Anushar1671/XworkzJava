package com.xworkz.InheritancePrograms;

public class ShowroomUtil {
	public static void run(Showroom showroom) {
		System.out.println(showroom.name);
		showroom.location();
		if(showroom instanceof WatchShowroom) {
			System.out.println("showroom is WatchShowroom");
			WatchShowroom watchShowroom=(WatchShowroom)showroom;
			System.out.println(watchShowroom.location);
			watchShowroom.service();
		}
		
		if(showroom instanceof MobileShowroom) {
			System.out.println("showroom is MobileShowroom");
			MobileShowroom mobileShowroom=(MobileShowroom)showroom;
			System.out.println(mobileShowroom.service);
			mobileShowroom.sell();
		}	
	}

}
