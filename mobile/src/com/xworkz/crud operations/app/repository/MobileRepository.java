package com.xworkz.crud.app.repository;

import com.xworkz.crud.app.dto.MobileDTO;

public interface MobileRepository {
	int TOTAL_ITEMS=10;
	
	void save(MobileDTO dto);
	
	default boolean isExist(MobileDTO dto) {
		return false;
		
	}
	
	default MobileDTO findByBrand(String brand) {
		return null;
		
	}

}
