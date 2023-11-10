package com.xworkz.app.boot;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.app.dto.HardwareDTO;

public class HardWareRunner {

	public static void main(String[] args) {
		System.out.println("Running main in HardwareRunner");
		HardwareDTO hardware1 = new HardwareDTO("CPU", 350, "8 cores", 3.6f);
        HardwareDTO hardware2 = new HardwareDTO("GPU", 560, "8 GB ", 1600.0f);
        HardwareDTO hardware3 = new HardwareDTO("RAM", 80, "16 GB", 2400.0f);
        HardwareDTO hardware4 = new HardwareDTO("SSD", 120, "500 GB", 550.0f);
        HardwareDTO hardware5 = new HardwareDTO("Motherboard", 150.0, "ATX", 0.0f);
        HardwareDTO hardware6 = new HardwareDTO("GPU", 560, "8 GB ", 1600.0f);
        HardwareDTO hardware7 = new HardwareDTO("CPU", 350, "8 cores", 3.6f);
        Collection<HardwareDTO> hardwareCollection=new HashSet<HardwareDTO>();
        hardwareCollection.add(hardware1);
        hardwareCollection.add(hardware2);
        hardwareCollection.add(hardware3);
        hardwareCollection.add(hardware4);
        hardwareCollection.add(hardware5);
        hardwareCollection.add(hardware6);
        hardwareCollection.add(hardware7);
        System.out.println("Total Hardwares: "+hardwareCollection.size());

	}

}

