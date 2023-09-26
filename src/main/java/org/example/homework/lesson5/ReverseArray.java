package org.example.homework.lesson5;

import java.util.Arrays;

/*
Есть массив чисел, нужно инвертировать его порядок, т.е. массив [0,1,2,3,4] -> [4,3,2,1,0]
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4};
        System.out.println(Arrays.toString(array));
        invertArray(array);
    }

    private static void invertArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
