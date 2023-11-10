package com.xworkz.app.boot;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.app.dto.FireDTO;

public class FireRunner {

	public static void main(String[] args) {
		FireDTO dto=new FireDTO(25, true, "north", "Oxygen");
		FireDTO dto1=new FireDTO(35, false, "south", "shrubs");
		FireDTO dto2=new FireDTO(20, true, "east", "trees");
		FireDTO dto3=new FireDTO(30, true, "west", "oils");
		FireDTO dto4=new FireDTO(26, false, "north-east", "gases");
		FireDTO dto5=new FireDTO(30, true, "west", "oils");
		FireDTO dto6=new FireDTO(20, true, "east", "trees");

		Collection<FireDTO> collection=new HashSet<FireDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		System.out.println("Size of dto :"+collection.size());
	}

}
