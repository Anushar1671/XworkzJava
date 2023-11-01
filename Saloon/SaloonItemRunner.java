package com.xworkz.app.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.app.dto.SaloonItemDTO;

public class SaloonItemRunner {

	public static void main(String[] args) {
		SaloonItemDTO itemDTO1 = new SaloonItemDTO(1, "Hair Dryer", 2500, "Hair Drying", true);
		SaloonItemDTO itemDTO2 = new SaloonItemDTO(2, "Scissors", 250, "Hair cut", true);
		SaloonItemDTO itemDTO3 = new SaloonItemDTO(3, "Gloves", 250, "Protection", true);
		SaloonItemDTO itemDTO4 = new SaloonItemDTO(4, "Comb", 150, "Hair Brush", true);
		SaloonItemDTO itemDTO5 = new SaloonItemDTO(5, "Hair Curlers", 3000, "Hair Curling", false);
		SaloonItemDTO itemDTO6 = new SaloonItemDTO(6, "Chair", 4500, "Relax", true);
		SaloonItemDTO itemDTO7 = new SaloonItemDTO(7, "Hair Strengthening Comb", 300, "Hair Styling", true);
		SaloonItemDTO itemDTO8 = new SaloonItemDTO(8, "Pedicure tub", 10000, "Pedicure", true);
		SaloonItemDTO itemDTO9 = new SaloonItemDTO(9, "Beauty Laser", 12000, "Spa", false);
		SaloonItemDTO itemDTO10 = new SaloonItemDTO(10, "Wax Heater", 5000, "Waxing", false);

		Collection<SaloonItemDTO> saloon = new ArrayList();
		saloon.add(itemDTO1);
		saloon.add(itemDTO2);
		saloon.add(itemDTO3);
		saloon.add(itemDTO4);
		saloon.add(itemDTO5);
		saloon.add(itemDTO6);
		saloon.add(itemDTO7);
		saloon.add(itemDTO8);
		saloon.add(itemDTO9);
		saloon.add(itemDTO10);

		System.out.println("Total items in collection : " + saloon.size());
		Iterator<SaloonItemDTO> itr = saloon.iterator();
		while (itr.hasNext()) {
			SaloonItemDTO dto = itr.next();
			System.out.println("Saloon Items : " + dto.getName());
		}
		System.out.println("++++++++++++++++++++++++++++");
		int count = 0;
		for (SaloonItemDTO saloonItem : saloon) {
			if (saloonItem.getName().contains("Hair")) {
				System.out.println("Saloon Items list : " + saloonItem.getName());
				count++;
			}

		}
		System.out.println(count);
		
		SaloonItemDTO itemDTO11 = new SaloonItemDTO(8, "Pedicure tub", 10000, "Pedicure", true);
		SaloonItemDTO itemDTO12 = new SaloonItemDTO(9, "Beauty Laser", 12000, "Spa", false);
		SaloonItemDTO itemDTO13 = new SaloonItemDTO(10, "Wax Heater", 5000, "Waxing", false);
		SaloonItemDTO itemDTO14 = new SaloonItemDTO(15, "Wax Heater", 5000, "Waxing", false);

		
		Collection<SaloonItemDTO> itemDTOs=new ArrayList();
		itemDTOs.add(itemDTO11);
		itemDTOs.add(itemDTO12);
		itemDTOs.add(itemDTO13);
		itemDTOs.add(itemDTO14);
		
		
		Collection<SaloonItemDTO> itemDTOs1=new ArrayList();
		itemDTOs1.add(itemDTO11);
		itemDTOs1.add(itemDTO12);
		
		boolean ref=saloon.contains(itemDTO13);
		System.out.println("Collection contains :"+ref);
		
		boolean ref1=saloon.containsAll(itemDTOs);
		System.out.println("Collection containsAll :"+ref1);
		System.out.println("Total items in collection : " + saloon.size());

		boolean ref2=saloon.remove(itemDTO13);
		System.out.println("Collection remove :"+ref2);
		System.out.println("Total items in collection : " + saloon.size());

		boolean ref3=itemDTOs.removeAll(itemDTOs1);
		System.out.println("Collection removeAll :"+ref3);
		System.out.println("Total items in collection : " + itemDTOs.size());

		
		
	}
}
