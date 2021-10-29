package com.example.lab6cmput301;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCityList {
    private CityList tmplist;
    // a function that returns a city list with one element of Edmonton
    private CityList mockCityList(){
        CityList cityList = new CityList();
        cityList.addCity(mockCity());
        return cityList;
    }

    private City mockCity(){
        return new City("Edmonton","Alberta");
    }

    @Test
    void testAddCity(){
        tmplist = mockCityList();
        assertEquals(1,tmplist.getCities().size());

        City city = new City("ningbo","zhejiang");
        tmplist.addCity(city);

        assertEquals(2,tmplist.getCities().size());
        assertTrue(tmplist.getCities().contains(city));

        City city2 = new City("dalian","liaoning");
        tmplist.addCity(city2);
        // assertthrows expects the tmplist to second argument to throw an exception of
        // the first argument, if the expectation hold true, then the assertThrows
        // statement is true
        assertThrows(IllegalArgumentException.class, ()->{
            tmplist.addCity(city2);
        });
    }

    /*    @Test
    void testGetCities(){
        CityList cityList = mockCityList();
        // testing initialization of CityList
        assertEquals(1,cityList.getCities().size());
        assertEquals("Edmonton",mockCityList().getCities().get(0).getCityName());
    }*/

    @Test
    void testHasCity(){
        tmplist = mockCityList();
        City city = new City("shenyang","liaoning");
        tmplist.addCity(city);
        assertEquals(true,tmplist.hasCity(city));
    }

    @Test
    void testDeleteCity(){
        tmplist = mockCityList();
        City city = new City("changchun","jilin");
        assertThrows(IllegalArgumentException.class,()->{tmplist.delete(mockCity());});
        tmplist.addCity(city);
        assertEquals(1,tmplist.getCities().size());
        tmplist.delete(city);
        assertEquals(1,tmplist.getCities().size());
    }

    @Test
    void testcountCities(){
        tmplist = mockCityList();
        assertEquals(1,tmplist.countCities());
    }
}
