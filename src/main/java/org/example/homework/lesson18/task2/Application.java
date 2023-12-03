package org.example.homework.lesson18.task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Task 2
Скопируйте в проект любое изображение.
С помощью FileInputReader и FileOutputReader сделайте копию файла.

 */
public class Application {
    private static final String PATH = "src/main/java/org/example/homework/lesson18/task2/";
    private static final String SRC = "Bubalev.PNG";
    private static final String DEST = "Bubalev_copy.PNG";

    public static void main(String[] args) throws IOException {
        try (FileInputStream fis = new FileInputStream(PATH + SRC);
             FileOutputStream fos = new FileOutputStream(PATH + DEST)) {
            byte[] bytes = fis.readAllBytes();
            fos.write(bytes);
        }
    }
}
