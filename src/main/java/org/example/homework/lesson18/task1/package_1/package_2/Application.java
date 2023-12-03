package org.example.homework.lesson18.task1.package_1.package_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Task 1
В пакете с ДЗ создайте пакет package_1, внутри его еще один пакет package_2, а внутри его - текстовый файл (example.txt).
В классе Application c помощью класса File проверить, являются ли папками package_1 и package_2.
Создать внутри package_2 папку package_3.
С помощью класса Scanner прочитать и вывести в консоль содержимое файла example.txt

 */
public class Application {
    public static void main(String[] args) {
        String path1 = "src/main/java/org/example/homework/lesson18/task1/package_1";
        String path2 = "src/main/java/org/example/homework/lesson18/task1/package_1/package_2";

        File filePath1 = new File(path1);
        File filePath2 = new File(path2);
        boolean isPackage1 = filePath1.isDirectory();
        boolean isPackage2 = filePath2.isDirectory();

        System.out.println(isPackage1);
        System.out.println(isPackage2);

        String path3 = "src/main/java/org/example/homework/lesson18/task1/package_1/package_2/package_3/example.txt";

        File filePath3 = new File(path3);

        try {
            Scanner scanner = new Scanner(filePath3);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
