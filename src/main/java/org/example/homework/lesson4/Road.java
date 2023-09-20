package org.example.homework.lesson4;

import java.util.Scanner;

/*
При старте программы пользователя просят ввести время в пути в секундах.
Затем, при помощи цикла while выводить на экран извилистую дорогу.

Определить время старта программы можно при помощи System.currentTimeMillis() - это вернет вам текущее время в миллисекундах.

 */
public class Road {
    private static final String ROAD_PATTERN = "||  |  ||";
    private static final int START_INDENT = 7;
    private static final double MS_IN_S = 1000;
    private static final int MAX_INDENT = 8;
    private static final char INDENT_SYMBOL = ' ';
    private static boolean left = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time in seconds");
        double limit = scanner.nextDouble();
        double startTime = System.currentTimeMillis() / MS_IN_S;
        int indent = START_INDENT;
        while (duration(startTime) <= limit) {
            drawRoad(indent);
            indent = nextIndent(indent);
        }
    }

    private static double duration(double startTime) {
        double currentTime = System.currentTimeMillis() / MS_IN_S;
        return currentTime - startTime;
    }

    private static void drawRoad(int numSpaces) {
        String line = "";
        for (int i = 1; i <= numSpaces; i++) {
            line += INDENT_SYMBOL;
        }
        line += ROAD_PATTERN;
        System.out.println(line);
    }

    private static int nextIndent(int currentIndent) {

        if (currentIndent == 0) {
            left = false;

        } else if (currentIndent == MAX_INDENT) {
            left = true;
        }
        if (left) {
            return currentIndent - 1;
        } else {
            return currentIndent + 1;
        }
    }
}
