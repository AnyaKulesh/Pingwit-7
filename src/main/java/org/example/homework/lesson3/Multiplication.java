package org.example.homework.lesson3;

/*
Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */
public class Multiplication {
    private static final int A = 5;
    private static final int B = 8;

    public static void main(String[] args) {
        int mult = 0;
        int a = A;
        int b = B;
        if (B < 0) {
            a = -A;
            b = -B;
        }
        for (int i = 1; i <= b; i++) {
            mult += a;
        }
        System.out.println(mult);
    }
}
