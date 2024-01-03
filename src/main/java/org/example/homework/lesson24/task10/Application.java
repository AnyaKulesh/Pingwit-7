package org.example.homework.lesson24.task10;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/*
При помощи лямбда выражения, написать свой компаратор, который бы сортировал лист строк в обратном порядке
 */
public class Application {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>(List.of("Yana", "Eva", "Alex", "Sanya", "Egor", "Sveta", "Lev", "Karina"));

        List<String> reversedNames = namesList.stream()
                .sorted((x, y) -> -StringUtils.compare(x, y))
                .toList();
        System.out.println(reversedNames);
    }
}
