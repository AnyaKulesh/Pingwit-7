package org.example.homework.lesson7.task1;
/*
Создайте класс, у которого будут поля имя и возраст.
У класса должен быть конструктор, который принимает в виде аргументов эти два поля и конструктор без аргументов,
который присваивает значения по умолчанию для имени и возраста.
Добавьте в класс блок инициализации, который будет выводить на экран сообщение о том, что создали новый экземпляр класса.

 */
public class Pet {
    private static String text = "Hello from static";
    private final String name;
    private final int age;
    static {
        System.out.println(text);
    }

    {
        System.out.println("Created a new Pet instance");
    }

    public Pet() {
        this.name = "Liza";
        this.age = 15;
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setText(String text) {
        Pet.text = text;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", text=" + text +
                '}';
    }
}
