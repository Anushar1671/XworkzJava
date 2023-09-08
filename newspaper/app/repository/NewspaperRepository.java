package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.NewspaperDTO;

public interface NewspaperRepository {
	int TOTAL_ITEMS = 5;

	void save(NewspaperDTO dto);

}
