package com.rivwox.albums.respository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.rivwox.albums.model.EuroWinModel;

public interface YearEuroRepository extends CrudRepository<EuroWinModel,Long> {
		@Query(nativeQuery = true, value="SELECT * FROM eurowin00s WHERE year= :year")
		public EuroWinModel get_year(Long year);
	
}
