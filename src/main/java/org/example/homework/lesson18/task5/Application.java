package org.example.homework.lesson18.task5;

import java.io.*;

/*
Task 5
Создайте в проекте текстовый файл с вашей любимой песней.
С помощью BufferedReader и BufferedWriter создайте копию файла + выведите содержимое в консоль

 */
public class Application {
    private static final String PATH = "src/main/java/org/example/homework/lesson18/task5/";
    private static final String SRC = "Hardkiss.txt";
    private static final String DEST = "Cranes.txt";

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH + SRC));
             BufferedWriter writer = new BufferedWriter(new FileWriter(PATH + DEST))) {
            String line = reader.readLine();
            while (line != null) {
                writer.write(line + "\n");
                System.out.println(line);
                line = reader.readLine();
            }
        }
    }
}
