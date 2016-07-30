package com.cooperdevs.countries.model;

public class Country {
    private String name;
    private String flagName;
    private int population;
    private String capital;
    private String language;

    public Country(String name, int population, String capital, String language) {
        this.name = name;
        this.flagName = name.toLowerCase();
        this.population = population;
        this.capital = capital;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlagName() {
        return flagName;
    }

    public void setFlagName(String flagName) {
        this.flagName = flagName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
