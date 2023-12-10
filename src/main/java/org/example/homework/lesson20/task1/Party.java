package org.example.homework.lesson20.task1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Task 1
Вход на вечеринку только по списку.
Создайте список имен (коллекция). Пользователь вводит с консоли свое имя, а программа проверяет его наличие в списке,
после чего говорит может он пройти или нет
 */
public class Party {
    private static final Set<String> ACCEPTANCE_LIST = new HashSet<>(Arrays.asList("anna kulesh", "alex kozlov", "lev kozlov", "karina gamza", "dima katushka", "alehandro balcony"));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        if (ACCEPTANCE_LIST.contains(name.toLowerCase().trim())) {
            System.out.println("You may come in");
        } else {
            System.out.println("You're not allowed to come in(");
        }
    }
}
