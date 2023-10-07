package org.example.homework.lesson7.task7;

import java.math.BigDecimal;

/*
Создайте класс HarvestStatistic
String plant - название растения
BigDecimal totalWeight - общий вес урожая со всех полей

 */
public class HarvestStatistic {
    private final String plant;
    private BigDecimal totalWeight;

    public HarvestStatistic(String plant, BigDecimal totalWeight) {
        this.plant = plant;
        this.totalWeight = totalWeight;
    }

    public String getPlant() {
        return plant;
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }
    public void addWeight(BigDecimal weight){
       totalWeight = totalWeight.add(weight);
    }

    @Override
    public String toString() {
        return "HarvestStatistic{" +
                "plant='" + plant + '\'' +
                ", totalWeight=" + totalWeight +
                '}';
    }
}
