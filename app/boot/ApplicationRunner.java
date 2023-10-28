package com.xworkz.app.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.app.dto.ApplicationDTO;

public class ApplicationRunner {

	public static void main(String[] args) {
		ApplicationDTO dto = new ApplicationDTO("WhatsApp", "1.8", "Meta", LocalDate.now(), 4.5);
		ApplicationDTO dto1 = new ApplicationDTO("Instagram", "5.1.1", "Meta", LocalDate.of(2023, 8, 20), 4);
		ApplicationDTO dto2 = new ApplicationDTO("Youtube", "Android", "youtube", LocalDate.of(2023, 10, 22), 4.8);
		ApplicationDTO dto3 = new ApplicationDTO("Facebook", "2.0", "meta", LocalDate.of(2023, 2, 3), 4.2);
		ApplicationDTO dto4 = new ApplicationDTO("LinkedIn", "Android", "LinkedIn", LocalDate.of(2022, 5, 6), 4.9);

		Collection<ApplicationDTO> application=new ArrayList();
		application.add(dto);
		application.add(dto1);
		application.add(dto2);
		application.add(dto3);
		application.add(dto4);
		Iterator<ApplicationDTO> itr=application.iterator();
		while(itr.hasNext()) {
			ApplicationDTO applicatonDTO=itr.next();
			System.out.println("Application : "+applicatonDTO.getName());
		}
		
		
	}

}
