package com.xworkz.app.boot;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.app.dto.TowerDTO;

public class TowerRunner {

	public static void main(String[] args) {
		TowerDTO towerDTO = new TowerDTO("Burj Khalifa", 2717, true, "Dubai");
		TowerDTO towerDTO1 = new TowerDTO("Tokyo Skytree", 2080, false, "Japan");
		TowerDTO towerDTO2 = new TowerDTO("Mecca", 1972, true, "Saudi Arabia");
		TowerDTO towerDTO3 = new TowerDTO("Diamond", 1312, false, "Israel");
		TowerDTO towerDTO4 = new TowerDTO("Canton tower", 1982, false, "China");

		Collection<TowerDTO> towerDTOs = new LinkedList<TowerDTO>();
		towerDTOs.add(towerDTO);
		towerDTOs.add(towerDTO1);
		towerDTOs.add(towerDTO2);
		towerDTOs.add(towerDTO3);
		towerDTOs.add(towerDTO4);

		towerDTOs.stream().sorted().forEach(r -> System.out.println(r));
	}

}
