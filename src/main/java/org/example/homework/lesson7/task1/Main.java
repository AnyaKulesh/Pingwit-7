package org.example.homework.lesson7.task1;

import java.util.Arrays;

/*
Создайте массив, состоящий из объектов класса из 'Task 1'. Выведите полученный массив на экран, должны отображаться
названия полей класса и их значения.

 */
public class Main {
    public static void main(String[] args) {
        Pet[] cat = new Pet[]{
                new Pet("Vasya", 4),
                new Pet("John", 5),
                new Pet()
        };
        System.out.println(Arrays.toString(cat));

        cat[1].setText("Changed");
        System.out.println(Arrays.toString(cat));
    }
}
