package com.cooperdevs.countries.controller;

import com.cooperdevs.countries.data.CountryRepository;
import com.cooperdevs.countries.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
}
