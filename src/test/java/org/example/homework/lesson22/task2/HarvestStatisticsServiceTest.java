package org.example.homework.lesson22.task2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

class HarvestStatisticsServiceTest {

    @Test
    void testCalculateStatisticsSuccess() {
        List<Harvest> harvests = List.of(
                new Harvest("Hotezhino", BigDecimal.valueOf(100), "Bulba", BigDecimal.valueOf(300)),
                new Harvest("Hotelkino", BigDecimal.valueOf(50), "Cucumber", BigDecimal.valueOf(150)),
                new Harvest("Perdelkino", BigDecimal.valueOf(120), "Bulba", BigDecimal.valueOf(350))
        );

        Map<String, HarvestStatistics> expected = new HashMap<>() {{
            put("Bulba", new HarvestStatistics("Bulba", BigDecimal.valueOf(650), BigDecimal.valueOf(220)));
            put("Cucumber", new HarvestStatistics("Cucumber", BigDecimal.valueOf(150), BigDecimal.valueOf(50)));
        }};

        Map<String, HarvestStatistics> actual = HarvestStatisticsService.calculateStatistics(harvests);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testCalculatedStatisticsEmpty() {
        Map<String, HarvestStatistics> actual = HarvestStatisticsService.calculateStatistics(new ArrayList<>());
        Assertions.assertThat(actual).isEqualTo(new HashMap<>());
    }

    @Test
    void testCalculatedStatisticsNullPlants() {
        List<Harvest> harvests = List.of(
                new Harvest("Hotezhino", BigDecimal.valueOf(100), "Bulba", BigDecimal.valueOf(300)),
                new Harvest("Hotelkino", BigDecimal.valueOf(50), "Cucumber", BigDecimal.valueOf(150)),
                new Harvest("Perdelkino", BigDecimal.valueOf(120), null, BigDecimal.valueOf(350)),
                new Harvest("Nuhnulkino", BigDecimal.valueOf(80), null, BigDecimal.valueOf(250))
        );

        Map<String, HarvestStatistics> expected = new HashMap<>() {{
            put("Bulba", new HarvestStatistics("Bulba", BigDecimal.valueOf(300), BigDecimal.valueOf(100)));
            put("Cucumber", new HarvestStatistics("Cucumber", BigDecimal.valueOf(150), BigDecimal.valueOf(50)));
            put(null, new HarvestStatistics(null, BigDecimal.valueOf(600), BigDecimal.valueOf(200)));
        }};

        Map<String, HarvestStatistics> actual = HarvestStatisticsService.calculateStatistics(harvests);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testCalculatedStatisticsNullHarvest() {
        List<Harvest> harvests = Arrays.asList(
                new Harvest("Hotezhino", BigDecimal.valueOf(100), "Bulba", BigDecimal.valueOf(300)),
                new Harvest("Hotelkino", BigDecimal.valueOf(50), "Cucumber", BigDecimal.valueOf(150)),
                null
        );

        Map<String, HarvestStatistics> expected = new HashMap<>() {{
            put("Bulba", new HarvestStatistics("Bulba", BigDecimal.valueOf(300), BigDecimal.valueOf(100)));
            put("Cucumber", new HarvestStatistics("Cucumber", BigDecimal.valueOf(150), BigDecimal.valueOf(50)));
        }};

        Map<String, HarvestStatistics> actual = HarvestStatisticsService.calculateStatistics(harvests);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testCalculatedStatisticsNullList() {
        assertThrows(NullPointerException.class, () -> HarvestStatisticsService.calculateStatistics(null));
    }
}