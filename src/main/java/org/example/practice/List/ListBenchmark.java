package org.example.practice.List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListBenchmark {

    private static final int COUNT = 20_000;
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>();
        for (int i = 0; i < COUNT; i++) {
            numbers.add(i);
            numbers2.add(i);
        }

        testToList(numbers);
    }

    private static void testToList(List<Integer> numbers) {
        long currentTime = System.currentTimeMillis();

        for (int i = COUNT - 1; i >= 0; i--) {
            int toRemove = i;
            numbers = numbers.stream().filter(x -> x != toRemove).toList();
        }

        long endTime = System.currentTimeMillis();
        System.out.println(" Removal time : " + (endTime - currentTime));
    }
    private static void testCollectorsToList(List<Integer> numbers) {
        long currentTime = System.currentTimeMillis();

        for (int i = COUNT - 1; i >= 0; i--) {
            int toRemove = i;
            numbers = numbers.stream().filter(x -> x != toRemove).collect(Collectors.toList());
        }

        long endTime = System.currentTimeMillis();
        System.out.println(" Removal time : " + (endTime - currentTime));
    }
}
