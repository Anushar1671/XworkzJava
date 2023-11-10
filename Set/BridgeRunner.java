package com.xworkz.app.boot;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.app.dto.BridgeDTO;

public class BridgeRunner {

	public static void main(String[] args) {
		BridgeDTO bridgeDTO=new BridgeDTO("Hanging bridge", "Honnavar", 2000, true);
		BridgeDTO bridgeDTO1=new BridgeDTO("Kabni", "Nanjangudu", 2001, true);
		BridgeDTO bridgeDTO2=new BridgeDTO("Wellesley", "Shrirangapatna", 2003, false);
		BridgeDTO bridgeDTO3=new BridgeDTO("Sharavathi", "Shimoga", 2002, true);
		BridgeDTO bridgeDTO4=new BridgeDTO("Mandekolu", "Coorg", 1990, false);
		BridgeDTO bridgeDTO5=new BridgeDTO("Hanging bridge", "Honnavar", 2000, true);
		BridgeDTO bridgeDTO6=new BridgeDTO("Wellesley", "Shrirangapatna", 2003, false);

		Collection<BridgeDTO> collection=new HashSet<BridgeDTO>();
		collection.add(bridgeDTO);
		collection.add(bridgeDTO1);
		collection.add(bridgeDTO2);
		collection.add(bridgeDTO3);
		collection.add(bridgeDTO4);
		collection.add(bridgeDTO5);
		collection.add(bridgeDTO6);
		
		System.out.println("Size of dto :"+collection.size());
	}

}
