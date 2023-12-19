package org.example.homework.lesson21.task1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Task 1
Создайте класс для описания футбольного клуба, в нем должны содержаться название клуба, страна, и город.
В классе Application создайте список клубов из разных стран.
Напишите метод, который примет на вход списк клубов, а вернет коллекцию их стран (страны не должны дублироваться)
 */
public class Application {
    public static void main(String[] args) {
        List<FootballClub> footballClubs = List.of(
                new FootballClub("Chelsey", "England", "London"),
                new FootballClub("Real Madrid", "Spain", "Madrid"),
                new FootballClub("Inter Milan", "Italy", "Milan"),
                new FootballClub("Arsenal", "England", "London"),
                new FootballClub("PSG", "France", "Paris"),
                new FootballClub("Barcelona", "Spain", "Barcelona"),
                new FootballClub("Bavaria", "Germany", "Munich")
        );
        System.out.println(extractCountryNames(footballClubs));
    }

    private static Set<String> extractCountryNames(List<FootballClub> clubs) {
        Set<String> countryNames = new HashSet<>();
        for (FootballClub footballClub : clubs) {
            countryNames.add(footballClub.getCountry());
        }
        return countryNames;
    }
}


