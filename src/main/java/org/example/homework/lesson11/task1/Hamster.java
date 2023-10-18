package org.example.homework.lesson11.task1;

import java.math.BigDecimal;

public class Hamster extends Pet {
    private final BigDecimal bodyLength;
    private final String coatColour;

    public Hamster(long id, String petName, Owner owner, BigDecimal bodyLength, String coatColour) {
        super(id, petName, owner);
        this.bodyLength = bodyLength;
        this.coatColour = coatColour;
    }

    public BigDecimal getBodyLength() {
        return bodyLength;
    }

    public String getCoatColour() {
        return coatColour;
    }

    @Override
    public String toString() {
        return "Hamster{" +
                "bodyLength=" + bodyLength +
                ", coatColour='" + coatColour + '\'' +
                '}';
    }
}
