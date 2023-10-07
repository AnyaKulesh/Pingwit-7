package org.example.homework.lesson6.task2;

public class Car {
    private final String registrationNumber;  // небольшое уточнение - это поле уже находится внутри класса Car, поэтому достаточно будет registrationNumber
    private final Owner dataOwner;

    public Car(String registrationNumber, Owner dataOwner) {
        this.registrationNumber = registrationNumber;
        this.dataOwner = dataOwner;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Owner getDataOwner() {
        return dataOwner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carRegistrationNumber='" + +'\'' +
                ", dataOwner=" + dataOwner +
                '}';
    }
}
