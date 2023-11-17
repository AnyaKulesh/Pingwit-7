package org.example.homework.lesson15.task2;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
"Fedor, Petrov, 7, 1980-25-02; Peter, Parker, 4, 1970-01-01; Inna, Filatova, 6, 1994-02-10"
 */
public class PersonParser {
    public Person[] parse(String text) {
        String[] personStrings = text.split(";");
        Person[] persons = new Person[personStrings.length];
        for (int i = 0; i < personStrings.length; i++) {
            persons[i] = parsePerson(personStrings[i]);
        }
        return persons;
    }

    private Person parsePerson(String text) {
        String[] fields = text.split(",");
        String name = fields[0].trim();
        String surname = fields[1].trim();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        LocalDate birthDate = LocalDate.parse(fields[3].trim(), formatter);

        DayOfWeek favouriteWeekDay = null;
        try {
            favouriteWeekDay = DayOfWeek.of(Integer.parseInt(fields[2].trim()));
        } catch (DateTimeException e) {
            System.out.println(e.getMessage());
        }

        return new Person(name,
                surname,
                birthDate,
                favouriteWeekDay);
    }
}
