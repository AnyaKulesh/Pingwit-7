package org.example.homework.lesson20.task3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Task 3
Есть ArrayList и LinkedList на 100К одинаковых элементов.
Нужно написать бенчмарк, который бы показал скорость удаления из НАЧАЛА у двух этих листов
Удалить нужно все элементы

 */
public class RemoveFromBeginningBenchmark {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            arrayList.add("stringTest");
            linkedList.add("stringTest");
        }
        System.out.println("ArrayList:");
        testRemoval(arrayList);
        System.out.println("LinkedList:");
        testRemoval(linkedList);

    }

    private static void testRemoval(List<String> list) {
        long currentTime = System.currentTimeMillis();
        while (!list.isEmpty()) {
            list.remove(0);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(" Removal time : " + (endTime - currentTime));
    }
}
