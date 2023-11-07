package com.xworkz.app.boot;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.app.dto.OceanDTO;

public class OceanRunner {

	public static void main(String[] args) {
		OceanDTO oceanDTO=new OceanDTO("Pacific", 40, 165200, 12762);
		OceanDTO oceanDTO1=new OceanDTO("Atlantic", 22, 106400, 11962);
		OceanDTO oceanDTO2=new OceanDTO("Indian", 20, 73556, 14042);
		OceanDTO oceanDTO3=new OceanDTO("Antarctic", 15, 20327, 3406);
		OceanDTO oceanDTO4=new OceanDTO("Arctic", 4, 13986, 10499);
		
		Collection<OceanDTO> oceanDTOs=new LinkedList<OceanDTO>();
		oceanDTOs.add(oceanDTO);
		oceanDTOs.add(oceanDTO1);
		oceanDTOs.add(oceanDTO2);
		oceanDTOs.add(oceanDTO3);
		oceanDTOs.add(oceanDTO4);
		
		oceanDTOs.stream().sorted().forEach(ocean->System.out.println(ocean));
		

	}

}
