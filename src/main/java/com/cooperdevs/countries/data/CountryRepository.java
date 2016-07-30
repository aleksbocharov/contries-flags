package com.cooperdevs.countries.data;

import com.cooperdevs.countries.model.Country;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CountryRepository {
    private static final List<Country> ALL_COUNTRIES = Arrays.asList(
            new Country("India", 1276267000, "New Delhi", "Hindi"),
            new Country("Kenya", 44350000 , "Nairobi", "Swahili"),
            new Country("Ecuador", 15740000 , "Quito", "Spanish"),
            new Country("France", 66030000, "Paris", "French"),
            new Country("Italy", 59830000, "Rome", "Italian")
    );

    public List<Country> getAllCountries() {
        return ALL_COUNTRIES;
    }

    public Country getByName(String name){
        return ALL_COUNTRIES.stream().filter(c->c.getFlagName().equals(name)).findFirst().orElse(null);
    }
}
