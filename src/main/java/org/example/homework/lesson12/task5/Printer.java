package org.example.homework.lesson12.task5;

import java.util.Random;

/*Создайте свое непроверяемое исключение.
        Создайте класс Printer с тремя методами: turnOn(), print(String document), turnOff().
        Метод print должен рандомно либо бросать ваше непроверяемое исключение, либо выводить в консоль строку.
        В классе Application создайте принтер, включите его и распечатайте любую строку. Обработайте ситуацию с ошибкой с
        помощью блока finally, в котором выключите принтер. Блок catch в этом задании не используйте.
*/
public class Printer {
    public void turnOn() {
        System.out.println("Printer is on");
    }

    public void print(String document) {
        Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println(document);
        } else {
            throw new MyException("Oops!.. Something went wrong...");
        }
    }

    public void turnOff(){
        System.out.println("Printer is off");
    }
}


