package org.example.homework.lesson12.task4;

/*Создайте класс Person с полями name и surname.
  Создайте интерфейс PersonReverser с одним методом reversePerson, который будет принимать на вход объект типа Person и возвращать
   объект типа Person с развернутыми наоборот именем и фамилией.
   Создайте две реализации этого интерфейса: первый - с использованием массива символов + цикл for,
   второй - с использованием StringUtils.
   В классе Application создайте два одинаковых объекта типа Person, а также по одному объекту двух видов PersonReverser.
   разверните оба Person-a с помощью реверсеров и сравните полученные объекты
*/
public class Person {
    private final String name;
    private final String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
