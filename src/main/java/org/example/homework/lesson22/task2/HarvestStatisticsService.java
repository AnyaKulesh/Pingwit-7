package org.example.homework.lesson22.task2;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class HarvestStatisticsService {
    public static HarvestStatistics[] calculateStatistics(Harvest[] harvest) {
        Map<String, BigDecimal> statistics = new HashMap<>();
        for (Harvest harvestItem : harvest) {
            if (statistics.containsKey(harvestItem.getPlant())) {
                BigDecimal newWeight = statistics.get(harvestItem.getPlant()).add(harvestItem.getWeight());
                BigDecimal newSquare = statistics.get(harvestItem.getPlant()).add(harvestItem.getSquare());
                statistics.put(harvestItem.getPlant(), newWeight);
                statistics.put(harvestItem.getPlant(), newSquare);
            } else {
                statistics.put(harvestItem.getPlant(), harvestItem.getWeight());
                statistics.put(harvestItem.getPlant(), harvestItem.getSquare());
            }
        }
        HarvestStatistics[] result = new HarvestStatistics[statistics.size()];
        int i = 0;
        for (Map.Entry<String, BigDecimal> entry : statistics.entrySet()) {
            result[i] = new HarvestStatistics(entry.getKey(), entry.getValue());
            i++;
        }
        return result;
    }
}
