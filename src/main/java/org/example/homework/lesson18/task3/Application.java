package org.example.homework.lesson18.task3;

import java.io.*;

/*

Task 3
Скопируйте в проект любое изображение.
С помощью BufferedInputReader и BufferedOutputReader сделайте копию файла.

 */
public class Application {
    private static final String PATH = "src/main/java/org/example/homework/lesson18/task3/";
    private static final String SRC = "Bubalev.PNG";
    private static final String DEST = "Bubalev_copy.PNG";

    public static void main(String[] args) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(PATH + SRC));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(PATH + DEST))) {
            int data = bis.read();
            while (data != -1) {
                bos.write(data);
                data = bis.read();
            }
            bos.flush();
        }
    }
}
