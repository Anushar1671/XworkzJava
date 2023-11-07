package com.xworkz.app.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.app.dto.PenDriveDTO;

public class PenDriveRunner {

	public static void main(String[] args) {
		PenDriveDTO penDriveDTO = new PenDriveDTO("128GB", "Sandisk", true, 1800);
		PenDriveDTO penDriveDTO1 = new PenDriveDTO("32GB", "HP", true, 180);
		PenDriveDTO penDriveDTO2 = new PenDriveDTO("1TB", "Sony", false, 200);
		PenDriveDTO penDriveDTO3 = new PenDriveDTO("16GB", "Samsung", true, 1500);
		PenDriveDTO penDriveDTO4 = new PenDriveDTO("512GB", "Kingstone", false, 2800);

		Collection<PenDriveDTO> dtos = new ArrayList<PenDriveDTO>();
		dtos.add(penDriveDTO);
		dtos.add(penDriveDTO1);
		dtos.add(penDriveDTO2);
		dtos.add(penDriveDTO3);
		dtos.add(penDriveDTO4);

		dtos.stream().sorted().forEach(p -> System.out.println(p));

	}

}
