package com.xworkz.app.boot;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.app.dto.CrackerDTO;

public class CrackerRunner {

	public static void main(String[] args) {
		CrackerDTO crackerDTO=new CrackerDTO("Sparkler", 100, "Banglore", "No");
		CrackerDTO crackerDTO1=new CrackerDTO("FlowerPot", 50, "Mysore", "No");
		CrackerDTO crackerDTO2=new CrackerDTO("Rocket", 150, "Bangaluru", "Yes");
		CrackerDTO crackerDTO3=new CrackerDTO("Twinkling Star", 200, "Shimoga", "No");
		CrackerDTO crackerDTO4=new CrackerDTO("Chakkars", 160, "Manglore", "Yes");
		CrackerDTO crackerDTO5=new CrackerDTO("Rocket", 150, "Bangaluru", "Yes");
		CrackerDTO crackerDTO6=new CrackerDTO("Sparkler", 100, "Banglore", "No");
		Collection<CrackerDTO> collection=new HashSet<CrackerDTO>();
		collection.add(crackerDTO);
		collection.add(crackerDTO1);
		collection.add(crackerDTO2);
		collection.add(crackerDTO3);
		collection.add(crackerDTO4);
		collection.add(crackerDTO5);
		collection.add(crackerDTO6);
		System.out.println("Size of dto :"+collection.size());

	}

}
