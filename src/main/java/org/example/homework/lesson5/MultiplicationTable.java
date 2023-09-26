package org.example.homework.lesson5;

import java.util.Arrays;

/*
При помощи двумерного массива вывести на экран таблицу умножения
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        int firstNum = 10;
        int secondNum = 10;
        int[][] array = new int[firstNum][secondNum];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }
}

