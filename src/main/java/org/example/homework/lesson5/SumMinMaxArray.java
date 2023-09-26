package org.example.homework.lesson5;

import java.util.Arrays;
import java.util.Scanner;

/*

Создать массив из 3 элементов. При помощи класса сканер и пользователя заполнить его.
Вывести сумму, наименьшее и наибольшее из чисел на экран

 */
public class SumMinMaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length");
        int length = scanner.nextInt();
        int[] array = initArray(length);
        printData(array);
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

    private static void printData(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int element : array) {
            sum += element;
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
    }
}
