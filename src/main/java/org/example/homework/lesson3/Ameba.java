package org.example.homework.lesson3;
/*
Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

 */
public class Ameba {
    private static final int START_NUMBER = 1;

    public static void main(String[] args) {
        int amebaCalculate = START_NUMBER;
        for (int i = 3; i <= 24; i += 3) {
            amebaCalculate *= 2;
            System.out.println("In " + i + " hours : " + amebaCalculate + " ameba ");
        }
    }
}
