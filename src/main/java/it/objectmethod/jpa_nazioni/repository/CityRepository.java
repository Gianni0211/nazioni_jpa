package it.objectmethod.jpa_nazioni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.objectmethod.jpa_nazioni.entity.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long>{

	public List<City> findByCountryCode(String countryCode);
	
	@Query(value="select c from City c  where (''  = ?2  or c.name = ?2) and ('' = ?1 or c.countryCode = ?1)")
	public List<City> findByCountryCodeOrName(String countryCode, String name);
	
	
}
