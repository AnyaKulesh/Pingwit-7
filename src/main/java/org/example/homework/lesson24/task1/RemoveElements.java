package org.example.homework.lesson24.task1;
/*
Task 1. (filter)
Есть коллекция строк, нужно убрать все элементы, длина которых меньше 5 символов

 */

import org.example.homework.lesson21.task1.FootballClub;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveElements {
    public static void main(String[] args) {
        List<FootballClub> footballClubs = Arrays.asList(
                new FootballClub("Chelsey", "England", "London"),
                new FootballClub("Real Madrid", "Spain", "Madrid"),
                new FootballClub("Inter Milan", "Italy", "Milan"),
                new FootballClub("Arsenal", "England", "London"),
                new FootballClub("PSG", "France", "Paris"),
                new FootballClub("Barcelona", "Spain", "Barcelona"),
                new FootballClub("Bavaria", "Germany", "Munich"),
                new FootballClub("Barcelona", "Spain", "Barcelona"),
                new FootballClub("PSG", "France", "Paris"),
                new FootballClub("Bate", "Belarus", "Borisov"),
                null,
                new FootballClub(null, null, null)
        );

        List<String> removeCollection = footballClubs.stream()
                .filter(Objects::nonNull)
                .map(FootballClub::getName)
                .filter(name -> name != null && name.length() >= 5)
                .toList();

        System.out.println(removeCollection);
    }
}
