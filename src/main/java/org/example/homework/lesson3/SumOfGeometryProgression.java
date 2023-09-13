package org.example.homework.lesson3;
/*
Вычислить: 1+2+4+8+...+256
 */
public class SumOfGeometryProgression {
    private static final int BASE = 1;
    private static final int FACTOR = 2;
    private static final int LIMIT = 256;

    public static void main(String[] args) {
        int sum = 0;
        for (int i = BASE; i <= LIMIT; i *= FACTOR) {
            sum += i;
        }
        System.out.println(sum);
    }
}
