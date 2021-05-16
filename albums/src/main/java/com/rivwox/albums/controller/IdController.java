package com.rivwox.albums.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rivwox.albums.model.AlbumModel;
import com.rivwox.albums.service.IdService;

@RestController
@RequestMapping("/format")
public class IdController {
	@Autowired
	IdService idservice;
	
	@GetMapping(value="fomats")
	public AlbumModel getformat() {
		Long id = 17L;
		return idservice.get_format(id);
		
	}
}
