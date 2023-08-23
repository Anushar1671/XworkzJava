package com.xworkz.app.interfaces.Runner;

import com.xworkz.app.interfaces.Engineering;
import com.xworkz.app.interfaces.Metro;
import com.xworkz.app.interfaces.Military;
import com.xworkz.app.interfaces.Pg;
import com.xworkz.app.interfaces.Temple;
import com.xworkz.app.interfaces.Implementation.ComputerScience;
import com.xworkz.app.interfaces.Implementation.MetroTrain;
import com.xworkz.app.interfaces.Implementation.MilitaryService;
import com.xworkz.app.interfaces.Implementation.PgLocation;
import com.xworkz.app.interfaces.Implementation.TempleLocation;

public class Runner {
	public static void main(String[] args) {
		Metro metro = new MetroTrain();
		metro.securityCheck();
		metro.run("Rajajinagar");
		metro.speed(25);
		System.out.println("-------------------------------");
		Temple temple = new TempleLocation();
		temple.dress(true);
		temple.entry(200);
		temple.name();
		System.out.println("-------------------------------");
		Engineering engineering = new ComputerScience();
		engineering.attendance();
		engineering.regular("CSE");
		engineering.since(2019);
		System.out.println("-------------------------------");
		Military military = new MilitaryService();
		military.age(35);
		military.location("Karnataka");
		military.name();
		System.out.println("-------------------------------");
		Pg pg = new PgLocation();
		pg.address(true);
		pg.pgName("SJR");
		pg.since(2023);

	}

}
