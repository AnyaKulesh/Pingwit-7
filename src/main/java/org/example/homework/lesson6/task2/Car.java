package org.example.homework.lesson6.task2;

public class Car {
    private String carRegistrationNumber;
    private Data dataOwner;

    public Car(String carRegistrationNumber, Data dataOwner) {
        this.carRegistrationNumber = carRegistrationNumber;
        this.dataOwner = dataOwner;
    }

    public String getCarRegistrationNumber() {
        return carRegistrationNumber;
    }

    public Data getDataOwner() {
        return dataOwner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carRegistrationNumber='" + carRegistrationNumber + '\'' +
                ", dataOwner=" + dataOwner +
                '}';
    }
}
