package com.xworkz.app.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

import com.xworkz.app.dto.TheaterDTO;

public class TheaterRunner {

	public static void main(String[] args) {
		TheaterDTO theaterDTO = new TheaterDTO("Lakshmi", "Shivamogga", 4, "SSE");
		TheaterDTO theaterDTO1 = new TheaterDTO("Navarang", "Rajajinagar", 4.5f, "Kantara");
		TheaterDTO theaterDTO2 = new TheaterDTO("PVR", "Koramangala", 3.8f, "Tatsama Tadbava");
		TheaterDTO theaterDTO3 = new TheaterDTO("HPC", "Shimoga", 3, "Ghost");
		TheaterDTO theaterDTO4 = new TheaterDTO("Bharat", "Mysore", 2.4f, "Baanadaariyali");

		Collection<TheaterDTO> dtos = new LinkedList<TheaterDTO>();
		dtos.add(theaterDTO);
		dtos.add(theaterDTO1);
		dtos.add(theaterDTO2);
		dtos.add(theaterDTO3);
		dtos.add(theaterDTO4);

		dtos.stream().sorted().forEach(p -> System.out.println(p));

	}

}
