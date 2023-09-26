package org.example.homework.lesson5;

import java.util.Arrays;
import java.util.Scanner;

/*
Есть массив чисел. Найти среднее арифметическое число элементов массива
 */
public class AverageArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length");
        int length = scanner.nextInt();
        int[] array = initArray(length);
        int sum = getSumOfArray(array);
        double average = (double) sum / array.length;
        System.out.println(average);
        System.out.println(Arrays.toString(array));
    }

    private static int[] initArray(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[length];
        System.out.println("Enter array elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int getSumOfArray(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }
}
