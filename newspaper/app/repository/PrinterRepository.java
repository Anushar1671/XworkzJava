package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.PrinterDTO;

public interface PrinterRepository {

	int TOTAL_ITEMS = 5;

	void save(PrinterDTO dto);
}
