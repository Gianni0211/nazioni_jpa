package it.objectmethod.jpa_nazioni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.jpa_nazioni.entity.City;
import it.objectmethod.jpa_nazioni.repository.CityRepository;

@RestController
@RequestMapping("/api/city")
public class CityController {

	@Autowired
	CityRepository cityRepo;

	@GetMapping("/{code}/find")
	public List<City> getCitiesByCountryCode(@PathVariable("code") String code) {
		return cityRepo.findByCountryCode(code);
	}

	@GetMapping("/find")
	public List<City> returnCityByNameAndCountry(@RequestParam("name") String name, @RequestParam("code") String code) {
		return cityRepo.findByCountryCodeOrName(code, name);
	}

	@RequestMapping("/save")
	public String updateCity(@RequestBody City city) {
		
		cityRepo.save(city);
		return city.getName() + " was saved to the DB";
	}
}
