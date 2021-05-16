package com.rivwox.albums.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rivwox.albums.model.AlbumModel;
import com.rivwox.albums.respository.IdRepository;

@Service
public class IdService {
	@Autowired
	IdRepository idrepo;
	
	public AlbumModel get_format(Long id) {
		AlbumModel result = idrepo.get_format(id);
		return result;
	}
}
