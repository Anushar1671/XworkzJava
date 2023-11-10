package com.xworkz.app.boot;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.app.dto.TyreDTO;

public class TyreRunner {

	public static void main(String[] args) {
		TyreDTO dto = new TyreDTO("Winter", 1500, "Michelin", "Bike");
		TyreDTO dto1 = new TyreDTO("AllSeason", 650, "Goodyear", "Car");
		TyreDTO dto2 = new TyreDTO("Part Worn", 2000, "Continental", "Auto");
		TyreDTO dto3 = new TyreDTO("Budget", 900, "Dunlop", "Bus");
		TyreDTO dto4 = new TyreDTO("Runflat", 2500, "Cooper", "Two wheeler");
		TyreDTO dto5 = new TyreDTO("Budget", 900, "Dunlop", "Bus");
		TyreDTO dto6 = new TyreDTO("Part Worn", 2000, "Continental", "Auto");
		Collection<TyreDTO> dtos = new HashSet<TyreDTO>();
		dtos.add(dto);
		dtos.add(dto1);
		dtos.add(dto2);
		dtos.add(dto3);
		dtos.add(dto4);
		dtos.add(dto5);
		dtos.add(dto6);
		System.out.println("Size of dto :" + dtos.size());

	}

}
