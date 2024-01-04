package org.example.homework.lesson24.task3;
/*
Task 3.
Возьмите класс Address и создайте список адресов. (в списке сделайте повторяющиеся адреса, несколько адресов в одном городе,
несколько адресов на одной улице)
Найдите в списке все названия улиц и соберите их в список.
 */

import org.example.homework.lesson24.task2.Address;

import java.util.List;


public class Application {
    public static void main(String[] args) {
        List<Address> addressList = List.of(
                new Address("Minsk", "Mayskaya", 2, 77),
                new Address("Minsk", "Karla Marksa", 8, 42),
                new Address("Minsk", "Karla Marksa", 5, 23),
                new Address("Kiev", "Mayskaya", 2, 77),
                new Address("Minsk", "Nemiga", 7, 56),
                new Address("Minsk", "Nemiga", 7, 56),
                new Address("Kiev", "Azovskaya", 7, 187),
                new Address("Kiev", "Darvin", 13, 18),
                new Address("Kiev", "Darvin", 156, 98),
                new Address("Kiev", "Kazanskaya", 78, 9),
                new Address("Kiev", "Darvin", 156, 98)
        );
        List<String> collectStreets = addressList.stream()
                .map(Address::getStreet) // тут я не совсем точно сформулировал - оставь в итоговом списке только уникальные названия
                .toList();
        System.out.println(collectStreets);
    }
}
