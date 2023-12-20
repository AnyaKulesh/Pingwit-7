package org.example.homework.lesson22.task2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Application {
    private static final String PATH = "src/main/java/org/example/homework/lesson22/task2/harvest.json";
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Harvest> harvests = Arrays.asList(objectMapper.readValue(new File(PATH), Harvest[].class));
        System.out.println(harvests);
        Map<String, HarvestStatistics> harvestStatistics = HarvestStatisticsService.calculateStatistics(harvests);

        ObjectWriter objectWriter = objectMapper.writer().withDefaultPrettyPrinter();
        System.out.println(objectWriter.writeValueAsString(harvestStatistics.values()));
    }
}