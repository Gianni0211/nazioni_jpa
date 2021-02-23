package it.objectmethod.jpa_nazioni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.jpa_nazioni.entity.Country;
import it.objectmethod.jpa_nazioni.repository.CountryRepository;

@RestController
@RequestMapping("/api/country")
public class CountryController {

	
	@Autowired
	CountryRepository countryRepo;
	
	@GetMapping("/continents")
	public List<String> findContinents(){
		return countryRepo.findAllContinents();
	}
	
	@GetMapping("/{continent}/find")
	public List<Country> getCountries(@PathVariable String continent) {
		
		return countryRepo.findByContinent(continent);
	}
	
	@GetMapping("/all")
	public List<Country> getAllCountries(){
		return countryRepo.findDistinctCountry();
	}
}
