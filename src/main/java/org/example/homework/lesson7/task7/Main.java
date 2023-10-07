package org.example.homework.lesson7.task7;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Harvest[] harvests = new Harvest[]{
                new Harvest(8967435L, "Bulbash", "Potato", new BigDecimal(560)),
                new Harvest(78493028L, "Popcorn", "Corn", new BigDecimal(389)),
                new Harvest(8967436L, "Agronom", "Potato", new BigDecimal(300)),
                new Harvest(78493029L, "Cinema", "Corn", new BigDecimal(478)),
                new Harvest(8967437L, "Dozhinki", "Potato", new BigDecimal(120)),
                new Harvest(12463764L, "Chunga-Changa", "Avocado", new BigDecimal(789))
        };

        HarvestStatisticService service = new HarvestStatisticService();
        HarvestStatistic[] statistics = service.calculateStatistic(harvests);
        System.out.println(Arrays.toString(statistics));
    }
}
