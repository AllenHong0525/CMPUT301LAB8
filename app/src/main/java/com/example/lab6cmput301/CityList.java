package com.example.lab6cmput301;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class contains list of cities belonging to class {@link City}
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This function add a new city into the list
     * @param city
     *  Takes input a new city of type {@link City}
     * @throws IllegalArgumentException
     * This function can also throw an Exception
     */
    public void addCity(City city){
        if(cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> l = cities;
        Collections.sort(l);
        return l;
    }

    /**
     * this returns if the list contains the city
     * @param city
     * Takes input a new city of type {@link City}
     * @return
     *  return if the city exist in the list {@link boolean}
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     * This returns nothing
     * @param city
     * Takes input a new city of type {@link City}
     * @throws IllegalArgumentException
     *  throws exception if city does not exist in the list while
     *  performing delete operation
     */
    public void delete(City city){
        // the city must already exist in the list
        if (!cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * This returns the size of the city list
     * @return
     * return the size of the list {@link int}
     */
    public int countCities(){
        return cities.size();
    }
}
