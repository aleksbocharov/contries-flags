package com.cooperdevs.countries.controller;

import com.cooperdevs.countries.data.CountryRepository;
import com.cooperdevs.countries.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CountryController {
    @Autowired
    private CountryRepository countryRepository;

    @RequestMapping("/")
    public String listCountries(ModelMap modelMap){
        List<Country> allCountries = countryRepository.getAllCountries();
        modelMap.put("countries", allCountries);
        return "home";
    }

    @RequestMapping("/country/{flagName}")
    public String viewCountry(@PathVariable String flagName, ModelMap modelMap){
        Country country = countryRepository.getByName(flagName);
        modelMap.put("country",country);
        return "details";
    }

    @RequestMapping("/sort-by-name")
    public String listCountriesByName(ModelMap modelMap){
        List<Country> allCountries = countryRepository.getCountriesSortedByName();
        modelMap.put("countries", allCountries);
        return "home";
    }

    @RequestMapping("/sort-by-population")
    public String listCountriesByPopulation(ModelMap modelMap){
        List<Country> allCountries = countryRepository.getCountriesSortedByPopulation();
        modelMap.put("countries", allCountries);
        return "home";
    }

}
