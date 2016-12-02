package com.tutorialspoint.springframework.restful;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daniel
 * Daniel-Dos 
 * daniel.dias.analistati@gmail.com
 */
@RestController
public class CountryController {

	@RequestMapping(value = "/countries", method = RequestMethod.GET, headers="accept=application/xml") 
	public List<Country> getCountries() {
		List<Country> listOfContries = new ArrayList<>();
		listOfContries = createCountryList();
		return listOfContries;
	}

	@RequestMapping(value = "/country/{id}", method = RequestMethod.GET, headers="accept=application/json")  
	public Country getCountryById(@PathVariable int id) {
		List<Country> listOfCountries = new ArrayList<>();
		listOfCountries = createCountryList();

		for(Country country : listOfCountries) {
			if(country.getId() == id)
				return country;
		}
		return null;
	}

	// Utiliy method to create county list
	public List<Country> createCountryList() {
		Country indiaCountry = new Country(1, "India");
		Country brasilCountry = new Country(4, "Brasil");
		Country nepalCountry = new Country(3, "Nepal");
		Country usaCountry = new Country(2, "USA");

		List<Country> listOfCountries = new ArrayList<>();
		listOfCountries.add(indiaCountry);
		listOfCountries.add(brasilCountry);
		listOfCountries.add(nepalCountry);
		listOfCountries.add(usaCountry);
		return listOfCountries;
	}
}