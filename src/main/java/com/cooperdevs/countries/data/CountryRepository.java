package com.cooperdevs.countries.data;

import com.cooperdevs.countries.model.Country;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class CountryRepository {
    private static final List<Country> ALL_COUNTRIES = Arrays.asList(
            new Country("India", 1276267000, "New Delhi", Arrays.asList("Hindi", "English")),
            new Country("Kenya", 44350000 , "Nairobi", Arrays.asList("Swahili", "English")),
            new Country("Ecuador", 15740000 , "Quito", Arrays.asList("Spanish")),
            new Country("France", 66030000, "Paris", Arrays.asList("French")),
            new Country("Italy", 59830000, "Rome", Arrays.asList("Italian"))
    );

    public List<Country> getCountriesSortedByName(){
        List<Country> sortByName = new ArrayList<>(ALL_COUNTRIES);
        sortByName.sort(Comparator.comparing(Country::getFlagName));
        return sortByName;
    }

    public List<Country> getCountriesSortedByPopulation(){
        List<Country> sortByPop = new ArrayList<>(ALL_COUNTRIES);
        sortByPop.sort(Comparator.comparing(Country::getPopulation).reversed());
        return sortByPop;
    }

    public List<Country> getAllCountries() {
        return ALL_COUNTRIES;
    }

    public Country getByName(String name){
        return ALL_COUNTRIES.stream().filter(c->c.getFlagName().equals(name)).findFirst().orElse(null);
    }
}
