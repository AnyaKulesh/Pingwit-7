package org.example.homework.lesson12.task4;

/*
Создайте интерфейс PersonReverser с одним методом reversePerson, который будет принимать на вход объект типа Person и возвращать
   объект типа Person с развернутыми наоборот именем и фамилией.

 */
public interface PersonReverser {
    Person reversePerson(Person person);

    static String updateCase(String value) { // очень детально
        return value.substring(0, 1).toUpperCase() + value.substring(1).toLowerCase();
    }
}


