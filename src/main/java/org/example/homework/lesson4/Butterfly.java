package org.example.homework.lesson4;

import java.util.Scanner;

/*
Нарисовать на консоли бабочку.
При запуске программы пользователя просят ввести размер бабочки (от 1 до 9 включительно) и затем программа выводит результат на экран.
Пример вывода для size = 8:

 */
public class Butterfly {
    private static final char SYMBOL = ' ';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter butterfly size");
        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            printLine(size, i);
        }
        for (int i = size - 1; i >= 1; i--) {
            printLine(size, i);
        }
    }

    private static void printLine(int size, int lineIndex) {
        String line = "";
        for (int i = 1; i <= lineIndex; i++) {
            line += i;
        }
        int numSpace = 2 * (size - lineIndex);
        for (int j = 1; j <= numSpace; j++) {
            line += SYMBOL;
        }
        for (int i = lineIndex; i >= 1; i--) {
            line += i;
        }
        System.out.println(line);
    }
}
