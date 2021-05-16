package com.rivwox.albums.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rivwox.albums.model.EuroWinModel;
import com.rivwox.albums.respository.YearEuroRepository;

@Service
public class YearService {
	@Autowired
	YearEuroRepository yeareurorepo;

	public EuroWinModel get_year(Long year) {
		EuroWinModel res = yeareurorepo.get_year(year);
		return res;	
	}
}
