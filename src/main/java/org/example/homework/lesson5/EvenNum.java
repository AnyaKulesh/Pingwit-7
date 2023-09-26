package org.example.homework.lesson5;

import java.util.Arrays;
import java.util.Scanner;

/*
Есть массив чисел. Необходимо создать другой массив содержащий только четные элементы из первого
 */
public class EvenNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length");
        int length = scanner.nextInt();
        int[] array = initArray(length);
        System.out.println(Arrays.toString(array));
        int[] evenArray = filterEvenNumbers(array);
        System.out.println(Arrays.toString(evenArray));
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

    private static int[] filterEvenNumbers(int[] array) {
        int counter = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                counter++;
            }
        }
        int[] evenArray = new int[counter];
        int j = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                evenArray[j] = number;
                j++;
            }
        }
        return evenArray;
    }
}
