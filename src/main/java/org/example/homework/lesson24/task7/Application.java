package org.example.homework.lesson24.task7;

import org.example.homework.lesson12.task1.Address;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.IntStream;


/*
С помощью метода  IntStream.range(..., ...) создайте поток чисел от 50 до 150. В потоке оставьте только числа, которые делатся на 7
и соберите их в список.

 */
public class Application {
    private static final int START_INCLUSIVE = 50;
    private static final int END_INCLUSIVE = 150;
    private static final int DIVISION_NUMBER = 7;

    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(START_INCLUSIVE, END_INCLUSIVE)
                .filter(i -> i % DIVISION_NUMBER == 0);
        List<Integer> list = intStream.boxed().toList();

        System.out.println(list);
    }
}
