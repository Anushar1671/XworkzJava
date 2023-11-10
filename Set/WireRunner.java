package com.xworkz.app.boot;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.app.dto.WireDTO;

public class WireRunner {

	public static void main(String[] args) {
		WireDTO dto=new WireDTO("Copper", 100, "Electrical", 2);
		WireDTO dto1=new WireDTO("Fiber", 100, "Optics", 2);
		WireDTO dto2=new WireDTO("Aluminium", 100, "Electricity", 2);
		WireDTO dto3=new WireDTO("Twisted", 100, "Transmit data", 2);
		WireDTO dto4=new WireDTO("Armoured", 100, "Protection", 2);
		WireDTO dto5=new WireDTO("Fiber", 100, "Optics", 2);
		WireDTO dto6=new WireDTO("Copper", 100, "Electrical", 2);
		Collection<WireDTO> wireDTOs=new HashSet<WireDTO>();
		wireDTOs.add(dto);
		wireDTOs.add(dto1);
		wireDTOs.add(dto2);
		wireDTOs.add(dto3);
		wireDTOs.add(dto4);
		wireDTOs.add(dto5);
		wireDTOs.add(dto6);
		System.out.println("Size of the DTO :"+wireDTOs.size());

	}

}
