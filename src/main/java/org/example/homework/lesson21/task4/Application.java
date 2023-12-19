package org.example.homework.lesson21.task4;

import java.util.ArrayList;
import java.util.List;

/*
Есть две коллекции, нужно удалить из первой те, которые есть во второй
 */
public class Application {
    public static void main(String[] args) {
        List<String> srcCollection = new ArrayList<>(List.of("Anya","Alex", "Lev","Karina","Helen"));
        List<String> removeList = new ArrayList<>(List.of("Lev","Vasya","Alex","Dima","Helen","Eva"));
        System.out.println("Before change : " + srcCollection);
        System.out.println("Names to remove : " + removeList);
        srcCollection.removeAll(removeList);
        System.out.println("After change : " + srcCollection);
    }
}
