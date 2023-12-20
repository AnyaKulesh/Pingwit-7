package org.example.homework.lesson22.task2;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;

public class HarvestStatistics {
    private final String plant;
    private BigDecimal totalWeight;
    private BigDecimal totalSquare;

    public HarvestStatistics(String plant, BigDecimal totalWeight, BigDecimal totalSquare) {
        this.plant = plant;
        this.totalWeight = totalWeight;
        this.totalSquare = totalSquare;
    }

    public String getPlant() {
        return plant;
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    public BigDecimal getTotalSquare() {
        return totalSquare;
    }

    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }

    public void setTotalSquare(BigDecimal totalSquare) {
        this.totalSquare = totalSquare;
    }

    @Override
    public String toString() {
        return "HarvestStatistics{" +
                "plant='" + plant + '\'' +
                ", totalWeight=" + totalWeight +
                ", totalSquare=" + totalSquare +
                '}';
    }
}
