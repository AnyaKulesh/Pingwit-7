package org.example.homework.lesson7.task6;

import java.util.Arrays;

/*
Напишите класс-каталог домов, в котором будет храниться название города, название района и список домов (массив).
Не забывайте про геттеры/сеттеры и toString()
 */
public class HouseCatalogue {
    private final String city;
    private final String district;
    private final House[] houses;

    public HouseCatalogue(String city, String district, House[] houses) {
        this.city = city;
        this.district = district;
        this.houses = houses;
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public House[] getHouses() {
        return houses;
    }

    @Override
    public String toString() {
        return "HouseCatalogue{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", houses=" + Arrays.toString(houses) +
                '}';
    }
}
