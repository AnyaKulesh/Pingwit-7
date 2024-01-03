package org.example.homework.lesson24.task8;

import java.util.List;
import java.util.stream.IntStream;

/*
Написать функцию перевода числа в строку с добавлением денежной единицы. Например, 5 -> 5 рублей.
Если получится, то учесть правильность окончаний, если нет, то можно сократить до "руб".
 */
public class Application {
    public static void main(String[] args) {
        List <Integer> numbers = IntStream.range(0,30).boxed().toList();
        numbers.stream()
                .map(Application::money)
                .forEach(System.out::println);

    }
    private static String money(Integer x) {
        int rest100 = x % 100;
        if (rest100 >= 10 && rest100 <= 19) {
            return x + " рублей";
        }
        int rest10 = x % 10;
        if (rest10 == 1) {
            return x + " рубль";
        }
        if (rest10 >= 2 && rest10 <= 4) {
            return x + " рубля";
        }
        return x + " рублей";
    }

}
