package org.example.homework.lesson22.task2;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HarvestStatisticsService {
    public static Map<String, HarvestStatistics> calculateStatistics(List<Harvest> harvests) {
        Map<String, HarvestStatistics> statistics = new HashMap<>();
        for (Harvest harvestItem : harvests) {
            if (harvestItem != null) {
                if (statistics.containsKey(harvestItem.getPlant())) {
                    HarvestStatistics itemStatistics = statistics.get(harvestItem.getPlant());
                    BigDecimal newWeight = itemStatistics.getTotalWeight().add(harvestItem.getWeight());
                    BigDecimal newSquare = itemStatistics.getTotalSquare().add(harvestItem.getSquare());
                    itemStatistics.setTotalWeight(newWeight);
                    itemStatistics.setTotalSquare(newSquare);
                } else {
                    statistics.put(harvestItem.getPlant(), new HarvestStatistics(harvestItem.getPlant(), harvestItem.getWeight(), harvestItem.getSquare()));
                }
            }
        }

        return statistics;
    }
}
