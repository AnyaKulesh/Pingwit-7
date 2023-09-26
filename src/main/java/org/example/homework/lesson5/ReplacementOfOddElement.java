package org.example.homework.lesson5;

import java.util.Arrays;
import java.util.Scanner;

/*
Есть массив чисел. Заменить каждый нечетный элемент массива на 0.
 */
public class ReplacementOfOddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length");
        int length = scanner.nextInt();
        int[] array = initArray(length);
        System.out.println(Arrays.toString(array));
        replaceOddElement(array);
    }

    private static int[] initArray(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[length];
        System.out.println("Enter array elements");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static void replaceOddElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
