package com.rivwox.albums.respository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.rivwox.albums.model.AlbumModel;

public interface IdRepository extends CrudRepository<AlbumModel,Long>{
	@Query(nativeQuery = true, value="SELECT * FROM album WHERE id= :id")
	public AlbumModel get_format(Long id);
}
