package org.example.homework.lesson6.task2;

import java.util.Arrays;

public class Parking {
    private final Car[] cars;

    public Parking(Car[] cars) {
        this.cars = cars;
    }

    public void open(String regNumber) {  // отлично импровизировала!
        for (Car car : cars) {
            if (regNumber.equals(car.getRegistrationNumber())) {
                System.out.println("Access allowed for " + car);
                return;
            }
        }
        System.out.println("Access denied for " + regNumber);
    }

    public void printCars() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    @Override
    public String toString() {
        return "Parking{" +
                "cars=" + Arrays.toString(cars) +
                '}';
    }

}
