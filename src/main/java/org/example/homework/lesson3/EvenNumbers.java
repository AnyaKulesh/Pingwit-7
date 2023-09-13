package org.example.homework.lesson3;

/*
Напишите программу вывода всех четных чисел от 2 до 100 включительно
 */
public class EvenNumbers {

    private static final int MAX_NUM = 100;
    private static final int MIN_NUM = 2;

    public static void main(String[] args) {
        int minNum = MIN_NUM;
        if (minNum % 2 == 1) {
            minNum++;
        }
        for (int i = minNum; i <= MAX_NUM; i += 2) {
            System.out.println(i);
        }
    }
}

