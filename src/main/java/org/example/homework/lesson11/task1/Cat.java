package org.example.homework.lesson11.task1;

/*
В системе должны существовать специализированные классы для питомцев: кота, собаки, попугайчика, хомяка
(здесь добавьте дополнительные признаки: для попугая - цвет, для кота - породу, для собаки - длину хвоста,
 для хомяка - объем щек + что угодно на ваше усмотрение). Также добавьте каждому типу питомца по собственному методу,
 на ваше усмотрение.
 */
public class Cat extends Pet {
    private final String eyesColor;
    private final int age;


    public Cat(long id, String petName, Owner owner, String eyesColor, int age) {
        super(id, petName, owner);
        this.eyesColor = eyesColor;
        this.age = age;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "eyesColor='" + eyesColor + '\'' +
                ", age=" + age +
                '}';
    }
}
