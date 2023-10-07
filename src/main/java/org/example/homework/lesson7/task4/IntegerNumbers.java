package org.example.homework.lesson7.task4;

import java.util.Arrays;

/*
Создайте массив целых чисел.
Напишите программу, которая распечатает новый массив, в который поместите элементы первого массива без изменений, если они нечетные,
а если четные - умножьте их на 5. Пример: исходный массив [4, 6, 10, 7, 1, 0, 2, 2] , результат - [20, 30, 50, 7, 1, 0, 10, 10]

 */
public class IntegerNumbers {
    public static void main(String[] args) {
        int[] array = {2, 6, 7, 4, 56, 87, 42};
        System.out.println(Arrays.toString(array));
        int[] newArray = filterEvenNumbers(array);
        System.out.println(Arrays.toString(newArray));
    }

    private static int[] filterEvenNumbers(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result[i] = array[i] * 5;
            } else {
                result[i] = array[i];
            }
        }
        return result;
    }
}
