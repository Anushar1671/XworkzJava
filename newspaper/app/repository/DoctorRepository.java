package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.DoctorDTO;

public interface DoctorRepository {
	int TOTAL_ITEMS=5;
	
	void save(DoctorDTO dto);

}
