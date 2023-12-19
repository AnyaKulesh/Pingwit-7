package org.example.homework.lesson21.task5;
/*
Есть две коллекции, нужно оставить в первой только те, которые есть во второй
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        List<String> srcCollection = new ArrayList<>(List.of("Lev","Vasya","Alex","Dima","Helen","Eva"));
        Set<String> keepCollection = new HashSet<>(List.of("Anya","Alex", "Lev","Karina","Helen"));
        System.out.println("Before change : " + srcCollection);
        System.out.println("Names to keep : " + keepCollection);

        List<String> removeCollection = new ArrayList<>();
        for (String element : srcCollection) {
            if (!keepCollection.contains(element)) {
                removeCollection.add(element);
            }
        }
        srcCollection.removeAll(removeCollection);

        System.out.println("After change : " + srcCollection );
    }
}
