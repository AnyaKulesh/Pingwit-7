package org.example.homework.lesson15.task2;

public class Application {
    private static final String TEXT = "Fedor, Petrov, 7, 1980-25-02; Peter, Parker, 4, 1970-01-01; Inna, Filatova, 6, 1994-02-10";
    private static final String INVALID_TEXT = "Fedor, Petrov, 7, 1980-25-02; Maks, Ermolaev, 12, 1987-02-03; Peter, Parker, 4, 1970-01-01; Inna, Filatova, 6, 1994-02-10";
    public static void main(String[] args) {
        PersonParser personParser = new PersonParser();
        Person[] persons = personParser.parse(INVALID_TEXT);
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
