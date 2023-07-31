package com.xworkz.Association;

public class PlayerRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in PlayerRunner");
		String name="Cricket";
		String building5="building";
		Floor floor1=new Floor("Ground",2);
		Floor floor2=new Floor("Firsst",3);
		Floor floor3=new Floor("Second",2);
		Floor floor4=new Floor("Third",2);
		Floor floor5=new Floor("Fourth",2);
		Floor floor6=new Floor("Five",2);
		Floor floor7=new Floor("Six",2);
		Floor[] floor= {floor1,floor2,floor3,floor4,floor5,floor6,floor7};
		
		Lift lift1=new Lift(5);
		Lift lift2=new Lift(8);
		Lift[] lift= {lift1,lift2};
		
		Building building1=new Building(floor,lift);
		Building building2=new Building(floor,lift);
		Building[] building= {building1,building2};
		
		Corporate corporate=new Corporate(building,"xworkz");
		
		Area area1=new Area("Street1",corporate);
		Area area2=new Area("Street2",corporate);
		Area area3=new Area("Street3",corporate);
		Area area4=new Area("Street4",corporate);
		Area area5=new Area("Street5",corporate);
		Area[] area= {area1,area2,area3,area4,area5};
		
		HomeTown homeTown=new HomeTown("Dehli",521425,area);
		Player player1=new Player(building,"Kohli","15 years",homeTown);
		Player player2=new Player(building,"Rohith","14 years",homeTown);
		Player player3=new Player(building,"Dhoni","25 years",homeTown);
		Player player4=new Player(building,"Jadeja","15 years",homeTown);
		Player player5=new Player(building,"KL Rahul","10 years",homeTown);
		Player[] players= {player1,player2,player3,player4,player5};
		
		Sport sport=new Sport(name,players);
		sport.printInfo();
		area1.printInfo();
				
		
	}

}
