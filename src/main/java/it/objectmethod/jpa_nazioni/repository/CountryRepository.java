package it.objectmethod.jpa_nazioni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.objectmethod.jpa_nazioni.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String>{

	public List<Country> findByContinent(String continent);
	
	@Query(value="select distinct c.continent from Country c")
	public List<String> findAllContinents();
	
	@Query(value="select distinct c from Country c")
	public List<Country> findDistinctCountry();
}
