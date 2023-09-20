package org.example.homework.lesson4;

import java.util.Arrays;

/*
Нарисуйте оставшиеся 2 треугольника.
Опционально: можете нарисовать все 4 фигуры, чтобы у вас получился ромб
   *  (1)
  **
 ***
****

****  (2)
 ***
  **
   *

 */
public class Rhombus {

    private static final int SIZE = 10;
    private static final char SPACE = ' ';
    private static final char STAR = '*';

    public static void main(String[] args) {

        for (int i = 1; i <= SIZE; i++) {
            printLine(i);
        }
        for (int i = SIZE; i >= 1; i--) {
            printLine(i);
        }
    }

    private static void printLine(int lineIndex) {
        String line = "";
        int numSpaces = SIZE - lineIndex;
        for (int j = 1; j <= numSpaces; j++) {
            line += SPACE;
        }
        int numStars = 2 * lineIndex;
        for (int j = 1; j <= numStars; j++) {
            line += STAR;
        }
        System.out.println(line);
    }
}


