package org.example.homework.lesson3;

/*
Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
 */
public class SumOfOddNumbers {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 99;

    public static void main(String[] args) {
        int sum = 0;
        int minNum = MIN_NUMBER;
        if (minNum % 2 == 0) {
            minNum++;
        }
        for (int i = minNum; i <= MAX_NUMBER; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
