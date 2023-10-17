package com.xworkz.crud.app.service;

import com.xworkz.crud.app.dto.MobileDTO;

public interface MobileService {
	boolean validateAndSave(MobileDTO dto);

	default MobileDTO findByBrand(String brand) {
		return null;

	}

}
