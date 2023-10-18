package org.example.homework.lesson11.task1;

import java.math.BigDecimal;

public class Dog extends Pet {
    private final String breed;
    private final BigDecimal weight;

    public Dog(long id, String petName, Owner owner, String breed, BigDecimal weight) {
        super(id, petName, owner);
        this.breed = breed;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", weight=" + weight +
                '}';
    }
}
