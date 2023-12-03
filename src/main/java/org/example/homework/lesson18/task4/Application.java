package org.example.homework.lesson18.task4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/*
Создайте в проекте текстовый файл с вашей любимой песней.
С помощью FileReader и FileWriter создайте копию файла + выведите содержимое в консоль

 */
public class Application {
    private static final String PATH = "src/main/java/org/example/homework/lesson18/task4/";
    private static final String SRC = "Hardkiss.txt";
    private static final String DEST = "Cranes.txt";

    public static void main(String[] args) throws IOException {
        try (FileReader reader = new FileReader(PATH + SRC);
             FileWriter writer = new FileWriter(PATH + DEST)) {
            char[] array = new char[20];
            int length = reader.read(array);
            while (length != -1) {
                writer.write(array, 0, length);
                System.out.print(Arrays.copyOf(array, length));
                length = reader.read(array);
            }
        }
    }
}
