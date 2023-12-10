package org.example.homework.lesson19.task1;

import java.io.*;

/*
Task 1
Создайте класс Motorcycle, в котором должны быть поля brand, model, engineVolume (объем двигателя в см3),
String condition.
В классе application создайте объект типа Motocycle и сериализуйте его с помощью java-сериализации. Поле
condition сериализоваться не должно!
Далее в этом же классе десериализуйте Motocycle из файла и выведите его в консоль
 */
public class Application {
    private static final String PATH1 = "src/main/java/org/example/homework/lesson19/task1/motorcycle.txt";
    private static final String PATH2 = "src/main/java/org/example/homework/lesson19/task1/motorcycle.txt";

    public static void main(String[] args) throws IOException {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "YZF-R1", "998", "new");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH1))) {
            oos.writeObject(motorcycle);
            System.out.println("Object successfully serialized");
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH2))) {
            Motorcycle motorcycle1 = (Motorcycle) ois.readObject();
            System.out.println("Object successfully deserialized from file:");
            System.out.println(motorcycle1);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
