package org.example.homework.lesson21.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
Создайте целочисленный ArrayList. Заполните его 100 элементами, добавляя каждый новый элемент в начало списка
и выведите на экран.
Затем удалите из него все четные элементы. И снова выведите на экран

 */
public class Application {
    private static final int RANDOM_UPPER_BOUND = 100;
    private static final int RANDOM_LOWER_BOUND = 0;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = RANDOM_LOWER_BOUND; i < RANDOM_UPPER_BOUND; i++) {
            arrayList.add(0, random.nextInt(RANDOM_UPPER_BOUND));
        }
        System.out.println(arrayList);
        removeEvenElements(arrayList);
        System.out.println(arrayList);

    }

    private static void removeEvenElements(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        numbers.removeAll(evenNumbers);
    }
}
