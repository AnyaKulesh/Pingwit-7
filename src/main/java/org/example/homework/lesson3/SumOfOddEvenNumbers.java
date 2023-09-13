package org.example.homework.lesson3;

/*
Даны числа от 0 до 100.
- Посчитать сумму четных и вывести на экран
- Посчитать сумму нечетных и вывести на экран
- Найти общую сумму всех чисел

 */
public class SumOfOddEvenNumbers {
    public static void main(String[] args) {
        int firstNumber = 0;
        int lastNumber = 100;
        int evenSum = 0;
        int oddSum = 0;
        for (int i = firstNumber; i <= lastNumber; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
            if (i % 2 == 1) {
                oddSum += i;
            }
        }
        System.out.println("Even sum : " + evenSum);
        System.out.println("Odd sum : " + oddSum);
        System.out.println("Total sum : " + (evenSum + oddSum));
    }
}
