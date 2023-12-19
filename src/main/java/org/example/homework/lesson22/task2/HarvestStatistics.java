package org.example.homework.lesson22.task2;

import java.math.BigDecimal;

public class HarvestStatistics {
    private String plant;
    private BigDecimal totalWeight;
    private BigDecimal totalSquare;

    public HarvestStatistics(String plant, BigDecimal totalWeight) {
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

    @Override
    public String toString() {
        return "HarvestStatistics{" +
                "plant='" + plant + '\'' +
                ", totalWeight=" + totalWeight +
                ", totalSquare=" + totalSquare +
                '}';
    }
}
