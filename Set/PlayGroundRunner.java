package com.xworkz.app.boot;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.app.dto.PlayGroundDTO;

public class PlayGroundRunner {

	public static void main(String[] args) {
		PlayGroundDTO dto = new PlayGroundDTO("Cricket", "chinnaswamy", true, 22);
		PlayGroundDTO dto1 = new PlayGroundDTO("VolleyBall", "RamMandir", false, 12);
		PlayGroundDTO dto2 = new PlayGroundDTO("Hockey", "Kanterava", true, 15);
		PlayGroundDTO dto3 = new PlayGroundDTO("Kabaddi", "Nehru", false, 14);
		PlayGroundDTO dto4 = new PlayGroundDTO("Football", "FootballClub", true, 24);
		PlayGroundDTO dto5 = new PlayGroundDTO("Cricket", "chinnaswamy", true, 22);
		PlayGroundDTO dto6 = new PlayGroundDTO("Hockey", "Kanterava", true, 15);
		Collection<PlayGroundDTO> collection = new HashSet<PlayGroundDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);

		System.out.println("Size of dto :" + collection.size());
	}

}
