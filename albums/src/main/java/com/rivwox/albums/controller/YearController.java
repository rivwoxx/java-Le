package com.rivwox.albums.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rivwox.albums.model.EuroWinModel;
import com.rivwox.albums.service.YearService;

@RestController
@RequestMapping("/eurovision")
public class YearController {
	@Autowired
	YearService yearservice;
	
	@GetMapping(value="byyear")
	public EuroWinModel getyear() {
		Long year = 2005L;
		return yearservice.get_year(year);
		
	}
	
	
}
