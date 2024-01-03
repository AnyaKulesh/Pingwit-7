package org.example.homework.lesson24.task5;

import java.util.Objects;

public class CityStreet {
    private final String city;
    private final String street;

    public CityStreet(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityStreet that = (CityStreet) o;
        return Objects.equals(city, that.city) && Objects.equals(street, that.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street);
    }

    @Override
    public String toString() {
        return "CItyStreet{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
