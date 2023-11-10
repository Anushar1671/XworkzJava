package com.xworkz.app.boot;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.app.dto.HangerDTO;

public class HangerRunner {

	public static void main(String[] args) {
		HangerDTO dto = new HangerDTO("Plastic", "Black", 100, true);
		HangerDTO dto1 = new HangerDTO("Wood", "White", 150, false);
		HangerDTO dto2 = new HangerDTO("Metal", "Silver", 200, true);
		HangerDTO dto3 = new HangerDTO("Cloth", "Grey", 50, false);
		HangerDTO dto4 = new HangerDTO("Suit", "Gold", 250, true);
		HangerDTO dto5 = new HangerDTO("Plastic", "Black", 100, true);
		HangerDTO dto6 = new HangerDTO("Cloth", "Grey", 50, false);
		Collection<HangerDTO> collection = new HashSet<HangerDTO>();
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
