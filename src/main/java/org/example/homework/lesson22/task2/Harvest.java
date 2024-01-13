package org.example.homework.lesson22.task2;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class Harvest {

    @JsonProperty("field_xms")
    private String field;
    @JsonProperty("square_xms")
    private  BigDecimal square;
    private  String plant;
    private  BigDecimal weight;

    public Harvest(String field, BigDecimal square, String plant, BigDecimal weight) {
        this.field = field;
        this.square = square;
        this.plant = plant;
        this.weight = weight;
    }

    public String getField() {
        return field;
    }

    public BigDecimal getSquare() {
        return square;
    }

    public String getPlant() {
        return plant;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Harvest{" +
                "field='" + field + '\'' +
                ", square=" + square +
                ", plant='" + plant + '\'' +
                ", weight=" + weight +
                '}';
    }
}
