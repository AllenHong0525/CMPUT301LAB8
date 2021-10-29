package com.example.lab6cmput301;

/**
 * this class represents a city
 *
 * @author Wenzhuo Hong
 */
public class City implements Comparable<City> {
    /**
     * This variable contains the name of the city
     * This var is of type {@link String}
     */
    private String cityName;
    private String provinceName;
    private City city;

    /**
     * @param cityName     Give name of the city, which should be of type {@link String}
     * @param provinceName Give name of the province, which should be of type {@link String}
     */
    public City(String cityName, String provinceName) {
        this.cityName = cityName;
        this.provinceName = provinceName;
    }

    /**
     * This function returns {@link City#cityName}
     *
     * @return The return type is {@link String}
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * This function doesn't return {@link City#setCityName}
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * This function returns {@link City#getProvinceName}
     *
     * @return The return type is {@link String}
     */
    public String getProvinceName() {
        return provinceName;
    }

    @Override
    public int compareTo(City city){
        return cityName.compareTo(city.getCityName());
    }

    /**
     * This function doesn't return {@link City#setProvinceName}
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
