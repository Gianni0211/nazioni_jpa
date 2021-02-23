package it.objectmethod.jpa_nazioni.validate.rules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.objectmethod.jpa_nazioni.repository.CountryRepository;

@Component
public class CountryCodeRule {

	@Autowired
	CountryRepository countryRepo;
	
	
	
	
}
